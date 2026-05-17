package rip.sayori.gsnb;

import com.cleanroommc.groovyscript.sandbox.security.GroovySecurityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mod(modid = "gsnb", version = "0.0.1", dependencies = "required-before:groovyscript")
public class ModMain {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) throws IllegalAccessException {
        ((List<String>)FieldUtils.readDeclaredField(GroovySecurityManager.INSTANCE, "bannedPackages", true)).clear();
        ((Set<String>)FieldUtils.readDeclaredField(GroovySecurityManager.INSTANCE, "bannedClasses", true)).clear();
        ((Map<String, Set<String>>)FieldUtils.readDeclaredField(GroovySecurityManager.INSTANCE, "bannedMethods", true)).clear();
    }

}
