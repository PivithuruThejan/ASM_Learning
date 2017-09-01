import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class C {
    public void execute(MethodVisitor mv, Label label){

        mv.visitLabel(label);
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        mv.visitLdcInsn("zeroth element");
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);

    }

    public  void execute1(MethodVisitor mv, Label label){
        mv.visitJumpInsn(GOTO, label);
    }

    public  void execute2(MethodVisitor mv, Label label){
        mv.visitLabel(label);
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        mv.visitLdcInsn("first element");
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
    }
}
