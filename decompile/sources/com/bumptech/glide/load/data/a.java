package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2378z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, boolean z2, int i) {
        super(contentResolver, uri, z2);
        this.f2378z = i;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f2378z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.m
    public final void c(Object obj) throws IOException {
        switch (this.f2378z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.m
    public final Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.f2378z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                boolean z2 = this.f2401v;
                ContentResolver contentResolver2 = this.f2403x;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (!z2 || !b8.h.B(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                boolean z10 = this.f2401v;
                ContentResolver contentResolver3 = this.f2403x;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = (!z10 || !b8.h.B(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver3.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver3, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}
