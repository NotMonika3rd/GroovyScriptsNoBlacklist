import com.cleanroommc.groovyscript.sandbox.security.GroovySecurityManager

for(var k in GroovySecurityManager.INSTANCE.getWhiteListedClasses())log.info("# >> " + k)

log.info('Hello World!')
