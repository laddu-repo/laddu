package w1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends c {
    public final ContentResolver B;
    public Uri C;
    public AssetFileDescriptor D;
    public FileInputStream E;
    public long F;
    public boolean G;

    public e(Context context) {
        super(false);
        this.B = context.getContentResolver();
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
                        throw new j(e10, 2000);
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
                    throw new j(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new j(e12, 2000);
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
                    throw new j(e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.E;
            String str = u1.a0.f12750a;
            int read = fileInputStream.read(bArr, i6, i10);
            if (read != -1) {
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
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i6 = 2000;
        try {
            Uri uri = lVar.f13542a;
            long j = lVar.f13547f;
            long j10 = lVar.f13546e;
            Uri normalizeScheme = uri.normalizeScheme();
            this.C = normalizeScheme;
            f();
            boolean equals = Objects.equals(normalizeScheme.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
            ContentResolver contentResolver = this.B;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            }
            this.D = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.E = fileInputStream;
                if (length != -1 && j10 > length) {
                    throw new j((Exception) null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (skip == j10) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.F = -1L;
                        } else {
                            long position = size - channel.position();
                            this.F = position;
                            if (position < 0) {
                                throw new j((Exception) null, 2008);
                            }
                        }
                    } else {
                        long j11 = length - skip;
                        this.F = j11;
                        if (j11 < 0) {
                            throw new j((Exception) null, 2008);
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
                throw new j((Exception) null, 2008);
            }
            throw new j(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (d e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i6 = 2005;
            }
            throw new j(e11, i6);
        }
    }

    @Override // w1.h
    public final Uri z() {
        return this.C;
    }
}
