package l0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class k extends android.support.v4.media.session.b {
    public static int B(FontStyle fontStyle, FontStyle fontStyle2) {
        int i6;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i6 = 0;
        } else {
            i6 = 2;
        }
        return abs + i6;
    }

    public static Font y(FontFamily fontFamily, int i6) {
        int i10;
        int i11;
        if ((i6 & 1) != 0) {
            i10 = 700;
        } else {
            i10 = CommonGatewayClient.CODE_400;
        }
        if ((i6 & 2) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        FontStyle fontStyle = new FontStyle(i10, i11);
        Font font = fontFamily.getFont(0);
        int B = B(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int B2 = B(fontStyle, font2.getStyle());
            if (B2 < B) {
                font = font2;
                B = B2;
            }
        }
        return font;
    }

    public Font A(q0.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // android.support.v4.media.session.b
    public final Typeface f(Context context, k0.e eVar, Resources resources, int i6) {
        try {
            FontFamily.Builder builder = null;
            for (k0.f fVar : eVar.f7552a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f7558f).setWeight(fVar.f7554b).setSlant(fVar.f7555c ? 1 : 0).setTtcIndex(fVar.f7557e).setFontVariationSettings(fVar.f7556d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(y(build2, i6).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // android.support.v4.media.session.b
    public final Typeface g(Context context, q0.i[] iVarArr, int i6) {
        try {
            FontFamily z10 = z(iVarArr, context.getContentResolver());
            if (z10 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(z10).setStyle(y(z10, i6).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // android.support.v4.media.session.b
    public final Typeface h(Context context, List list, int i6) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily z10 = z((q0.i[]) list.get(0), contentResolver);
            if (z10 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(z10);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily z11 = z((q0.i[]) list.get(i10), contentResolver);
                if (z11 != null) {
                    customFallbackBuilder.addCustomFallback(z11);
                }
            }
            return customFallbackBuilder.setStyle(y(z10, i6).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // android.support.v4.media.session.b
    public final Typeface i(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // android.support.v4.media.session.b
    public final Typeface j(Context context, Resources resources, int i6, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i6).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // android.support.v4.media.session.b
    public final q0.i k(q0.i[] iVarArr, int i6) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final FontFamily z(q0.i[] iVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (q0.i iVar : iVarArr) {
            if (Objects.equals(iVar.f10817a.getScheme(), "systemfont")) {
                font = A(iVar);
            } else {
                try {
                    Uri uri = iVar.f10817a;
                    str = iVar.f10821e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
                } catch (IOException e10) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(iVar.f10819c).setSlant(iVar.f10820d ? 1 : 0).setTtcIndex(iVar.f10818b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }
}
