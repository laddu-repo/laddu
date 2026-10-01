package se;

import com.google.android.gms.internal.measurement.e5;
import df.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public abstract class h extends k6.e {
    public static void p(File file, File target) {
        k.e(target, "target");
        if (file.exists()) {
            if (target.exists() && !target.delete()) {
                throw new e5(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (file.isDirectory()) {
                if (target.mkdirs()) {
                    return;
                } else {
                    throw new e5(file, target, "Failed to create target directory.");
                }
            }
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    e9.f.b(fileInputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    jb.b.j(fileInputStream, th);
                    throw th2;
                }
            }
        } else {
            throw new e5(file, null, "The source file doesn't exist.");
        }
    }

    public static String q(File file) {
        Charset charset = df.a.f4115a;
        k.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String q9 = lg.c.q(inputStreamReader);
            inputStreamReader.close();
            return q9;
        } finally {
        }
    }

    public static File r(File file) {
        int i6;
        boolean z10;
        int P;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        k.d(path, "getPath(...)");
        char c10 = File.separatorChar;
        boolean z11 = false;
        int P2 = m.P(path, c10, 0, 4);
        if (P2 == 0) {
            if (path.length() > 1 && path.charAt(1) == c10 && (P = m.P(path, c10, 2, 4)) >= 0) {
                int P3 = m.P(path, c10, P + 1, 4);
                if (P3 >= 0) {
                    i6 = P3 + 1;
                } else {
                    i6 = path.length();
                }
            } else {
                i6 = 1;
            }
        } else if (P2 > 0 && path.charAt(P2 - 1) == ':') {
            i6 = P2 + 1;
        } else if (P2 == -1 && m.L(path, ':')) {
            i6 = path.length();
        } else {
            i6 = 0;
        }
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return file2;
        }
        String file3 = file.toString();
        k.d(file3, "toString(...)");
        if (file3.length() == 0) {
            z11 = true;
        }
        if (!z11 && !m.L(file3, c10)) {
            return new File(file3 + c10 + file2);
        }
        return new File(file3 + file2);
    }

    public static final void s(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z10;
        k.e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            k.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        k.b(onUnmappableCharacter);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        k.d(allocate2, "allocate(...)");
        int i6 = 0;
        int i10 = 0;
        while (i6 < str.length()) {
            int min = Math.min(8192 - i10, str.length() - i6);
            int i11 = i6 + min;
            char[] array = allocate.array();
            k.d(array, "array(...)");
            str.getChars(i6, i11, array, i10);
            allocate.limit(min + i10);
            i10 = 1;
            if (i11 == str.length()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z10).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i10 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i6 = i11;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }
}
