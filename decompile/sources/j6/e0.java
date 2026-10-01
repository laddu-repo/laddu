package j6;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements a6.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a6.h f6935d = new a6.h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a9.g(25));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a6.h f6936e = new a6.h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new j());
    public static final o9.f f = new o9.f(14);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f6937g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f6938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6.a f6939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o9.f f6940c = f;

    public e0(d6.a aVar, d0 d0Var) {
        this.f6939b = aVar;
        this.f6938a = d0Var;
    }

    @Override // a6.k
    public final boolean a(Object obj, a6.i iVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a6.k
    public final c6.b0 b(Object obj, int i, int i10, a6.i iVar) throws Exception {
        long jLongValue = ((Long) iVar.c(f6935d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) iVar.c(f6936e);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) iVar.c(n.f6955g);
        if (nVar == null) {
            nVar = n.f;
        }
        n nVar2 = nVar;
        this.f6940c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f6938a.k(mediaMetadataRetriever, obj);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapC = c(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i10, nVar2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                a2.c.z((ExecutorService) mediaMetadataRetriever);
            } else {
                mediaMetadataRetriever.release();
            }
            return d.c(bitmapC, this.f6939b);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
                throw th3;
            }
            if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
                throw th3;
            }
            if (mediaMetadataRetriever instanceof ExecutorService) {
                a2.c.z((ExecutorService) mediaMetadataRetriever);
                throw th3;
            }
            mediaMetadataRetriever.release();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #2 {all -> 0x006b, blocks: (B:23:0x005f, B:25:0x0065), top: B:91:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, j6.n r21) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e0.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, j6.n):android.graphics.Bitmap");
    }
}
