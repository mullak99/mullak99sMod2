package mullak99.mullak99sMod.mobs;

import cpw.*;
import cpw.mods.*;
import cpw.mods.fml.*;
import cpw.mods.fml.client.*;
import cpw.mods.fml.client.modloader.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.modloader.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import ibxm.*;
import mullak99.mullak99sMod.mullak99;
import mullak99.mullakCore.mullakCore;
import net.*;
import net.minecraft.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.packet.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import java.util.Map;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;

public class mullak99Mob extends EntityMob
{



	public mullak99Mob(World par1World) {
		
		super(par1World);
		
		//this.setSize(1.5F, 2.0F);
		this.getNavigator().setBreakDoors(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityPlayer.class, 4.0D, false));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, ThundercoyoteMob.class, 4.0D, false));
		this.tasks.addTask(5, new EntityAIBreakDoor(this));
		this.tasks.addTask(5, new EntityAIWander(this, 2.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, ThundercoyoteMob.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, ThundercoyoteMob.class, 0, true));
		this.targetTasks.addTask(3, new EntityAIMoveTowardsTarget(this, 2.0D, 0.1F));
	
	}    

    
    protected boolean isAIEnabled()
    {
        return false;
    }
    
    @Override
    public boolean canAttackClass(Class par1Class)
    {
      return ThundercoyoteMob.class != null;
    }


    protected void dropFewItems(boolean par1, int par2)
    {
        int j;
        int k;

        j = this.rand.nextInt(3 + par2);

        for (k = 0; k < j; ++k)
        {
            this.dropItem(Item.bone.itemID, mullakCore.randomWithRange(2, 3));
            this.dropItem(mullak99.blood.itemID, mullakCore.randomWithRange(3, 6));
        }
    }
    
	    @Override
	    protected boolean canDespawn()
	    {
	    return false;
	    }
    
    
	    protected String getLivingSound()
	    {
	        return "mullak99:mob/mullak99_Living";
	    }


	    protected String getHurtSound()
	    {
	        return "mullak99:mob/mullak99_Hurt";
	    }


	    protected String getDeathSound()
	    {
	        return "mullak99:mob/mullak99_Death";
	    }

	    @Override
	    protected void applyEntityAttributes()
	    {
	    super.applyEntityAttributes();
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(50.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(2.2D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(20.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(100.0D);
	    }
	    
	    public EnumCreatureAttribute getCreatureAttribute()
	    {
	        return EnumCreatureAttribute.UNDEFINED;
	    }
	    
	    public String getDisplayName(){
	    	return "mullak99";
	    	}
	    

	    protected void entityInit()
	    {
	        super.entityInit();
	        this.getDataWatcher().addObject(12, Byte.valueOf((byte)0));
	        this.getDataWatcher().addObject(13, Byte.valueOf((byte)0));
	        this.getDataWatcher().addObject(14, Byte.valueOf((byte)0));
	    }
	    
	    @Override
	    protected boolean isValidLightLevel()
	    {
	    return true;
	    }
	    
	    @Override
	    protected float getSoundVolume()
	    {
	        return 0.4F;
	    }
}