import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class SiddhiClassLoader extends ClassLoader {

    public Class defineClass(String name, byte[] b){
        return defineClass(name,b,0,b.length);

    }
}

