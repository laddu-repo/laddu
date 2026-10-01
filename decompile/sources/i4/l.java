package i4;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6450a = 0;

    static {
        db.p0.m("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    public static long a(int i6) {
        switch (i6) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(h8.c.i(i6, "Unrecognized FolderType: "));
        }
    }

    public static j4.p b(r1.h0 h0Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l10;
        k7.c cVar = new k7.c(13);
        cVar.F("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = h0Var.f11463a;
        Bundle bundle = h0Var.I;
        Integer num = h0Var.f11477p;
        Uri uri2 = h0Var.f11474m;
        if (charSequence != null) {
            cVar.G(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = h0Var.f11467e;
        if (charSequence2 != null) {
            cVar.G(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = h0Var.f11468f;
        if (charSequence3 != null) {
            cVar.G(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = h0Var.f11469g;
        if (charSequence4 != null) {
            cVar.G(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = h0Var.f11464b;
        if (charSequence5 != null) {
            cVar.G(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = h0Var.f11465c;
        if (charSequence6 != null) {
            cVar.G(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = h0Var.f11466d;
        if (charSequence7 != null) {
            cVar.G(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (h0Var.f11480t != null) {
            cVar.D("android.media.metadata.YEAR", r7.intValue());
        }
        if (uri != null) {
            cVar.F("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            cVar.F("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            cVar.F("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            cVar.F("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            cVar.C("android.media.metadata.DISPLAY_ICON", bitmap);
            cVar.C("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            cVar.D("android.media.metadata.BT_FOLDER_TYPE", a(num.intValue()));
        }
        if (j == -9223372036854775807L && (l10 = h0Var.f11470h) != null) {
            j = l10.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        cVar.D("android.media.metadata.DURATION", j);
        j4.l0 d10 = d(h0Var.f11471i);
        if (d10 != null) {
            cVar.E("android.media.metadata.USER_RATING", d10);
        }
        j4.l0 d11 = d(h0Var.j);
        if (d11 != null) {
            cVar.E("android.media.metadata.RATING", d11);
        }
        if (h0Var.H != null) {
            cVar.D("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r6.intValue());
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null && !(obj instanceof CharSequence)) {
                    if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                        cVar.D(str2, ((Number) obj).longValue());
                    }
                } else {
                    cVar.G((CharSequence) obj, str2);
                }
            }
        }
        return new j4.p((Bundle) cVar.f7745y);
    }

    public static r1.v0 c(j4.l0 l0Var) {
        if (l0Var != null) {
            float f3 = l0Var.f7192y;
            int i6 = l0Var.f7191x;
            boolean z10 = true;
            switch (i6) {
                case 1:
                    if (l0Var.b()) {
                        if (i6 != 1 || f3 != 1.0f) {
                            z10 = false;
                        }
                        return new r1.s(z10);
                    }
                    return new r1.s();
                case 2:
                    if (l0Var.b()) {
                        if (i6 != 2 || f3 != 1.0f) {
                            z10 = false;
                        }
                        return new r1.y0(z10);
                    }
                    return new r1.y0();
                case 3:
                    if (l0Var.b()) {
                        return new r1.w0(3, l0Var.a());
                    }
                    return new r1.w0(3);
                case 4:
                    if (l0Var.b()) {
                        return new r1.w0(4, l0Var.a());
                    }
                    return new r1.w0(4);
                case 5:
                    if (l0Var.b()) {
                        return new r1.w0(5, l0Var.a());
                    }
                    return new r1.w0(5);
                case 6:
                    if (l0Var.b()) {
                        if (i6 != 6 || !l0Var.b()) {
                            f3 = -1.0f;
                        }
                        return new r1.m0(f3);
                    }
                    return new r1.m0();
                default:
                    return null;
            }
        }
        return null;
    }

    public static j4.l0 d(r1.v0 v0Var) {
        if (v0Var != null) {
            int f3 = f(v0Var);
            if (!v0Var.b()) {
                switch (f3) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new j4.l0(f3, -1.0f);
                    default:
                        return null;
                }
            }
            float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            switch (f3) {
                case 1:
                    if (((r1.s) v0Var).f11691c) {
                        f10 = 1.0f;
                    }
                    return new j4.l0(1, f10);
                case 2:
                    if (((r1.y0) v0Var).f11762c) {
                        f10 = 1.0f;
                    }
                    return new j4.l0(2, f10);
                case 3:
                case 4:
                case 5:
                    return j4.l0.d(f3, ((r1.w0) v0Var).f11739c);
                case 6:
                    return j4.l0.c(((r1.m0) v0Var).f11587b);
            }
        }
        return null;
    }

    public static int e(r1.d dVar) {
        u5.r rVar;
        if (Build.VERSION.SDK_INT >= 26) {
            rVar = new u5.r(13);
        } else {
            rVar = new u5.r(13);
        }
        AudioAttributes.Builder builder = (AudioAttributes.Builder) rVar.f12916y;
        builder.setContentType(dVar.f11348a);
        builder.setFlags(dVar.f11349b);
        rVar.B(dVar.f11350c);
        AudioAttributes audioAttributes = rVar.r().f7154a;
        audioAttributes.getClass();
        int flags = audioAttributes.getFlags();
        int usage = audioAttributes.getUsage();
        if ((flags & 1) == 1) {
            return 7;
        }
        if ((flags & 4) == 4) {
            return 6;
        }
        switch (usage) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int f(r1.v0 v0Var) {
        if (v0Var instanceof r1.s) {
            return 1;
        }
        if (v0Var instanceof r1.y0) {
            return 2;
        }
        if (v0Var instanceof r1.w0) {
            int i6 = ((r1.w0) v0Var).f11738b;
            int i10 = 3;
            if (i6 != 3) {
                i10 = 4;
                if (i6 != 4) {
                    i10 = 5;
                    if (i6 != 5) {
                        return 0;
                    }
                }
            }
            return i10;
        }
        if (v0Var instanceof r1.m0) {
            return 6;
        }
        return 0;
    }
}
