//import jdk.internal.org.objectweb.asm.*;

//import jdk.internal.org.objectweb.asm.FieldVisitor;
//import jdk.internal.org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.*;

import java.io.IOException;
import java.lang.reflect.Method;

import static com.sun.org.apache.bcel.internal.Constants.ISTORE_3;
import static jdk.internal.org.objectweb.asm.Opcodes.RETURN;
import static org.objectweb.asm.Opcodes.*;
//import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class A {
    public static void main(String args[]) throws Exception {
        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "B", null, "java/lang/Object", new String[]{"BFather"});

        cw.visitSource("B.java", null);

        {
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(1, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            mv.visitInsn(RETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "LB;", null, l0, l1, 0);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "my", "()V", null, null);
        }

        C c = new C();
        Label label1 = new Label();
        Label label2 = new Label();
        c.execute(mv, label1);
        c.execute2(mv, label2);
        c.execute1(mv, label1);

        mv.visitInsn(RETURN);
        mv.visitMaxs(2, 1);
        mv.visitEnd();
        cw.visitEnd();

        byte[] b = cw.toByteArray();
        SiddhiClassLoader siddhiClassLoader = new SiddhiClassLoader();
        Class regeneratedClass = siddhiClassLoader.defineClass("B", b);
        BFather b1 = (BFather) regeneratedClass.newInstance();
        b1.my();







    }
}
