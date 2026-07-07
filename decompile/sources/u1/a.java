package u1;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static ExecutorService f12748a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f12749b = new Object();

    public static String a(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (f12749b) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    public static void b(int i6, int i10) {
        GLES20.glBindTexture(i6, i10);
        c();
        GLES20.glTexParameteri(i6, 10240, 9729);
        c();
        GLES20.glTexParameteri(i6, 10241, 9729);
        c();
        GLES20.glTexParameteri(i6, 10242, 33071);
        c();
        GLES20.glTexParameteri(i6, 10243, 33071);
        c();
    }

    public static void c() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z10 = true;
        }
        if (!z10) {
        } else {
            throw new Exception(sb2.toString());
        }
    }

    public static void d(String str, boolean z10) {
        if (z10) {
        } else {
            throw new Exception(str);
        }
    }

    public static FloatBuffer e(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void f(String str, String str2) {
        synchronized (f12749b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void g(String str, String str2) {
        synchronized (f12749b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void h(String str, String str2, Throwable th) {
        synchronized (f12749b) {
            Log.e(str, a(str2, th));
        }
    }

    public static synchronized Executor i() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                if (f12748a == null) {
                    String str = a0.f12750a;
                    f12748a = Executors.newSingleThreadExecutor(new e1.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = f12748a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static int[] j(String str) {
        int i6;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i10 = indexOf4 + 2;
        if (i10 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i10) == '/') {
            i6 = str.indexOf(47, indexOf4 + 3);
            if (i6 == -1 || i6 > indexOf2) {
                i6 = indexOf2;
            }
        } else {
            i6 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i6;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void k(String str, String str2) {
        synchronized (f12749b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean l(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        d("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        d("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        c();
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        if (eglQueryString == null || !eglQueryString.contains(str)) {
            return false;
        }
        return true;
    }

    public static String m(StringBuilder sb2, int i6, int i10) {
        int i11;
        int i12;
        int i13;
        if (i6 >= i10) {
            return sb2.toString();
        }
        if (sb2.charAt(i6) == '/') {
            i6++;
        }
        int i14 = i6;
        int i15 = i14;
        while (i14 <= i10) {
            if (i14 == i10) {
                i11 = i14;
            } else if (sb2.charAt(i14) == '/') {
                i11 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb2.charAt(i15) == '.') {
                sb2.delete(i15, i11);
                i10 -= i11 - i15;
            } else {
                if (i14 == i15 + 2 && sb2.charAt(i15) == '.' && sb2.charAt(i16) == '.') {
                    i12 = sb2.lastIndexOf("/", i15 - 2) + 1;
                    if (i12 > i6) {
                        i13 = i12;
                    } else {
                        i13 = i6;
                    }
                    sb2.delete(i13, i11);
                    i10 -= i11 - i13;
                } else {
                    i12 = i14 + 1;
                }
                i15 = i12;
            }
            i14 = i15;
        }
        return sb2.toString();
    }

    public static String n(String str, String str2) {
        int i6;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int[] j = j(str2);
        if (j[0] != -1) {
            sb2.append(str2);
            m(sb2, j[1], j[2]);
            return sb2.toString();
        }
        int[] j10 = j(str);
        if (j[3] == 0) {
            sb2.append((CharSequence) str, 0, j10[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (j[2] == 0) {
            sb2.append((CharSequence) str, 0, j10[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = j[1];
        if (i10 != 0) {
            int i11 = j10[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return m(sb2, j[1] + i11, i11 + j[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, j10[1]);
            sb2.append(str2);
            int i12 = j10[1];
            return m(sb2, i12, j[2] + i12);
        }
        int i13 = j10[0] + 2;
        int i14 = j10[1];
        if (i13 < i14 && i14 == j10[2]) {
            sb2.append((CharSequence) str, 0, i14);
            sb2.append('/');
            sb2.append(str2);
            int i15 = j10[1];
            return m(sb2, i15, j[2] + i15 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, j10[2] - 1);
        if (lastIndexOf == -1) {
            i6 = j10[1];
        } else {
            i6 = lastIndexOf + 1;
        }
        sb2.append((CharSequence) str, 0, i6);
        sb2.append(str2);
        return m(sb2, j10[1], i6 + j[2]);
    }

    public static Uri o(String str, String str2) {
        return Uri.parse(n(str, str2));
    }

    public static void p(String str, String str2) {
        synchronized (f12749b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void q(String str, String str2, Throwable th) {
        synchronized (f12749b) {
            Log.w(str, a(str2, th));
        }
    }
}
