package w1;

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

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends c {
    public final Context B;
    public l C;
    public AssetFileDescriptor D;
    public FileInputStream E;
    public long F;
    public boolean G;

    public y(Context context) {
        super(false);
        this.B = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i6) {
        return Uri.parse("rawresource:///" + i6);
    }

    @Override // w1.h
    public final void close() {
        this.C = null;
        try {
            try {
                FileInputStream fileInputStream = this.E;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.E = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.D;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new j(null, e10, 2000);
                    }
                } finally {
                    this.D = null;
                    if (this.G) {
                        this.G = false;
                        c();
                    }
                }
            } catch (Throwable th) {
                this.E = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.D;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.D = null;
                        if (this.G) {
                            this.G = false;
                            c();
                        }
                        throw th;
                    } finally {
                        this.D = null;
                        if (this.G) {
                            this.G = false;
                            c();
                        }
                    }
                } catch (IOException e11) {
                    throw new j(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new j(null, e12, 2000);
        }
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.F;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e10) {
                    throw new j(null, e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.E;
            String str = u1.a0.f12750a;
            int read = fileInputStream.read(bArr, i6, i10);
            if (read == -1) {
                if (this.F != -1) {
                    throw new j("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
                long j10 = this.F;
                if (j10 != -1) {
                    this.F = j10 - read;
                }
                b(read);
                return read;
            }
        }
        return -1;
    }

    @Override // w1.h
    public final long y(l lVar) {
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i6;
        Resources resources;
        long min;
        this.C = lVar;
        f();
        Uri uri = lVar.f13542a;
        long j = lVar.f13547f;
        long j10 = lVar.f13546e;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.B;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i6 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new j("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                throw new j("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new j("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new j("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(host + ":" + path, "raw", null);
                if (parseInt == 0) {
                    throw new j("Resource not found.", null, 2005);
                }
            }
            i6 = parseInt;
            resources = resourcesForApplication;
        } else {
            throw new j("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i6);
            if (openRawResourceFd != null) {
                this.D = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.D.getFileDescriptor());
                this.E = fileInputStream;
                try {
                    if (length != -1 && j10 > length) {
                        throw new j(null, null, 2008);
                    }
                    long startOffset = this.D.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                    if (skip == j10) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.F = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.F = size;
                                if (size < 0) {
                                    throw new j(null, null, 2008);
                                }
                            }
                        } else {
                            long j11 = length - skip;
                            this.F = j11;
                            if (j11 < 0) {
                                throw new j(2008);
                            }
                        }
                        if (j != -1) {
                            long j12 = this.F;
                            if (j12 == -1) {
                                min = j;
                            } else {
                                min = Math.min(j12, j);
                            }
                            this.F = min;
                        }
                        this.G = true;
                        g(lVar);
                        if (j != -1) {
                            return j;
                        }
                        return this.F;
                    }
                    throw new j(null, null, 2008);
                } catch (x e11) {
                    throw e11;
                } catch (IOException e12) {
                    throw new j(null, e12, 2000);
                }
            }
            throw new j("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e13) {
            throw new j(null, e13, 2005);
        }
    }

    @Override // w1.h
    public final Uri z() {
        l lVar = this.C;
        if (lVar != null) {
            return lVar.f13542a;
        }
        return null;
    }
}
