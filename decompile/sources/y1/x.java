package y1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x extends c {
    public k A;
    public AssetFileDescriptor B;
    public FileInputStream C;
    public long D;
    public boolean E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Context f14398z;

    public x(Context context) {
        super(false);
        this.f14398z = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // y1.h
    public final void close() {
        this.A = null;
        try {
            try {
                FileInputStream fileInputStream = this.C;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.C = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.B;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new w(null, e7, 2000);
                    }
                } finally {
                    this.B = null;
                    if (this.E) {
                        this.E = false;
                        d();
                    }
                }
            } catch (Throwable th) {
                this.C = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.B;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.B = null;
                        if (this.E) {
                            this.E = false;
                            d();
                        }
                        throw th;
                    } finally {
                        this.B = null;
                        if (this.E) {
                            this.E = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new w(null, e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new w(null, e11, 2000);
        }
    }

    @Override // y1.h
    public final long h(k kVar) throws w {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.A = kVar;
        e();
        Uri uri = kVar.f14377a;
        long j8 = kVar.f;
        long j9 = kVar.f14381e;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f14398z;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new w("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new w("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new w("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new w("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e7, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new w("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new w("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new w("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.B = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.B.getFileDescriptor());
            this.C = fileInputStream;
            try {
                if (length != -1 && j9 > length) {
                    throw new w(null, null, 2008);
                }
                long startOffset = this.B.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j9) - startOffset;
                if (jSkip != j9) {
                    throw new w(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.D = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.D = size;
                        if (size < 0) {
                            throw new w(null, null, 2008);
                        }
                    }
                } else {
                    long j10 = length - jSkip;
                    this.D = j10;
                    if (j10 < 0) {
                        throw new i(2008);
                    }
                }
                if (j8 != -1) {
                    long j11 = this.D;
                    this.D = j11 == -1 ? j8 : Math.min(j11, j8);
                }
                this.E = true;
                f(kVar);
                return j8 != -1 ? j8 : this.D;
            } catch (w e10) {
                throw e10;
            } catch (IOException e11) {
                throw new w(null, e11, 2000);
            }
        } catch (Resources.NotFoundException e12) {
            throw new w(null, e12, 2005);
        }
    }

    @Override // t1.g
    public final int read(byte[] bArr, int i, int i10) throws w {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.D;
        if (j8 != 0) {
            if (j8 != -1) {
                try {
                    i10 = (int) Math.min(j8, i10);
                } catch (IOException e7) {
                    throw new w(null, e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.C;
            int i11 = w1.b0.f13686a;
            int i12 = fileInputStream.read(bArr, i, i10);
            if (i12 != -1) {
                long j9 = this.D;
                if (j9 != -1) {
                    this.D = j9 - ((long) i12);
                }
                b(i12);
                return i12;
            }
            if (this.D != -1) {
                throw new w("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // y1.h
    public final Uri s() {
        k kVar = this.A;
        if (kVar != null) {
            return kVar.f14377a;
        }
        return null;
    }
}
