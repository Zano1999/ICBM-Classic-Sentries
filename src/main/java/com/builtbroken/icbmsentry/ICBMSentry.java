package com.builtbroken.icbmsentry;

import com.builtbroken.mc.framework.mod.AbstractMod;
import com.builtbroken.mc.framework.mod.AbstractProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 4/11/2017.
 */
@Mod(modid = ICBMSentry.DOMAIN, name = "ICBM Sentries", version = ICBMSentry.VERSION, dependencies = ICBMSentry.DEPENDENCIES)
public class ICBMSentry extends AbstractMod
{
    /** Name of the channel and mod ID. */
    public static final String DOMAIN = "icbmsentry";
    public static final String PREFIX = DOMAIN + ":";

    /** The version of WatchYourStep. */
    public static final String MAJOR_VERSION = "@MAJOR@";
    public static final String MINOR_VERSION = "@MINOR@";
    public static final String REVISION_VERSION = "@REVIS@";
    public static final String BUILD_VERSION = "@BUILD@";
    public static final String VERSION = MAJOR_VERSION + "." + MINOR_VERSION + "." + REVISION_VERSION + "." + BUILD_VERSION;
    public static final String DEPENDENCIES = "required-after:voltzengine;required-after:armory;";

    @Mod.Instance(DOMAIN)
    public static ICBMSentry INSTANCE;

    @SidedProxy(clientSide = "com.builtbroken.icbmsentry.CommonProxy", serverSide = "com.builtbroken.icbmsentry.CommonProxy")
    public static CommonProxy proxy;

    public ICBMSentry()
    {
        super(DOMAIN);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event)
    {
        super.loadComplete(event);
    }

    @Override
    public AbstractProxy getProxy()
    {
        return proxy;
    }
}
