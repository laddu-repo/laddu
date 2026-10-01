package w9;

import a8.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Locale;
import ma.n;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f14244a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14245b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final float f14246c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14247d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14248e;

    /* renamed from: f, reason: collision with root package name */
    public final float f14249f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14250g;

    /* renamed from: h, reason: collision with root package name */
    public final float f14251h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14252i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14253k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14254l;

    public c(Context context) {
        AttributeSet attributeSet;
        int i6;
        int i10;
        boolean z10;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int i11;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        Locale locale;
        int next;
        Locale.Category unused;
        b bVar = new b();
        int i12 = bVar.f14241x;
        if (i12 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i12);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        attributeSet = asAttributeSet;
                        i6 = asAttributeSet.getStyleAttribute();
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i12));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i6 = 0;
        }
        if (i6 == 0) {
            i10 = R.style.Widget_MaterialComponents_Badge;
        } else {
            i10 = i6;
        }
        TypedArray f3 = n.f(context, attributeSet, t9.a.f12675c, R.attr.badgeStyle, i10, new int[0]);
        Resources resources = context.getResources();
        this.f14246c = f3.getDimensionPixelSize(5, -1);
        this.f14252i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f14247d = f3.getDimensionPixelSize(15, -1);
        this.f14248e = f3.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.f14250g = f3.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f14249f = f3.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f14251h = f3.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f14253k = f3.getInt(25, 1);
        this.f14254l = f3.getInt(2, 0);
        b bVar2 = this.f14245b;
        int i13 = bVar.F;
        bVar2.F = i13 == -2 ? 255 : i13;
        int i14 = bVar.H;
        if (i14 != -2) {
            bVar2.H = i14;
        } else if (f3.hasValue(24)) {
            this.f14245b.H = f3.getInt(24, 0);
        } else {
            this.f14245b.H = -1;
        }
        String str = bVar.G;
        if (str != null) {
            this.f14245b.G = str;
        } else if (f3.hasValue(8)) {
            this.f14245b.G = f3.getString(8);
        }
        b bVar3 = this.f14245b;
        bVar3.L = bVar.L;
        CharSequence charSequence = bVar.M;
        bVar3.M = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar4 = this.f14245b;
        int i15 = bVar.N;
        bVar4.N = i15 == 0 ? R.plurals.mtrl_badge_content_description : i15;
        int i16 = bVar.O;
        bVar4.O = i16 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i16;
        Boolean bool = bVar.Q;
        if (bool != null && !bool.booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        bVar4.Q = Boolean.valueOf(z10);
        b bVar5 = this.f14245b;
        int i17 = bVar.I;
        bVar5.I = i17 == -2 ? f3.getInt(22, -2) : i17;
        b bVar6 = this.f14245b;
        int i18 = bVar.J;
        bVar6.J = i18 == -2 ? f3.getInt(23, -2) : i18;
        b bVar7 = this.f14245b;
        Integer num = bVar.B;
        if (num == null) {
            intValue = f3.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue = num.intValue();
        }
        bVar7.B = Integer.valueOf(intValue);
        b bVar8 = this.f14245b;
        Integer num2 = bVar.C;
        if (num2 == null) {
            intValue2 = f3.getResourceId(7, 0);
        } else {
            intValue2 = num2.intValue();
        }
        bVar8.C = Integer.valueOf(intValue2);
        b bVar9 = this.f14245b;
        Integer num3 = bVar.D;
        if (num3 == null) {
            intValue3 = f3.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue3 = num3.intValue();
        }
        bVar9.D = Integer.valueOf(intValue3);
        b bVar10 = this.f14245b;
        Integer num4 = bVar.E;
        if (num4 == null) {
            intValue4 = f3.getResourceId(17, 0);
        } else {
            intValue4 = num4.intValue();
        }
        bVar10.E = Integer.valueOf(intValue4);
        b bVar11 = this.f14245b;
        Integer num5 = bVar.f14242y;
        if (num5 == null) {
            intValue5 = i.i(context, f3, 1).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        bVar11.f14242y = Integer.valueOf(intValue5);
        b bVar12 = this.f14245b;
        Integer num6 = bVar.A;
        if (num6 == null) {
            intValue6 = f3.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            intValue6 = num6.intValue();
        }
        bVar12.A = Integer.valueOf(intValue6);
        Integer num7 = bVar.f14243z;
        if (num7 != null) {
            this.f14245b.f14243z = num7;
        } else if (f3.hasValue(10)) {
            this.f14245b.f14243z = Integer.valueOf(i.i(context, f3, 10).getDefaultColor());
        } else {
            int intValue17 = this.f14245b.A.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue17, h.a.f5754y);
            obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ColorStateList i19 = i.i(context, obtainStyledAttributes, 3);
            i.i(context, obtainStyledAttributes, 4);
            i.i(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            if (obtainStyledAttributes.hasValue(12)) {
                i11 = 12;
            } else {
                i11 = 10;
            }
            obtainStyledAttributes.getResourceId(i11, 0);
            obtainStyledAttributes.getString(i11);
            obtainStyledAttributes.getBoolean(14, false);
            i.i(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes.getFloat(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes.getFloat(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, t9.a.E);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (Build.VERSION.SDK_INT >= 26) {
                obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
            }
            obtainStyledAttributes2.recycle();
            this.f14245b.f14243z = Integer.valueOf(i19.getDefaultColor());
        }
        b bVar13 = this.f14245b;
        Integer num8 = bVar.P;
        if (num8 == null) {
            intValue7 = f3.getInt(3, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        bVar13.P = Integer.valueOf(intValue7);
        b bVar14 = this.f14245b;
        Integer num9 = bVar.R;
        if (num9 == null) {
            intValue8 = f3.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        bVar14.R = Integer.valueOf(intValue8);
        b bVar15 = this.f14245b;
        Integer num10 = bVar.S;
        if (num10 == null) {
            intValue9 = f3.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        bVar15.S = Integer.valueOf(intValue9);
        b bVar16 = this.f14245b;
        Integer num11 = bVar.T;
        if (num11 == null) {
            intValue10 = f3.getDimensionPixelOffset(19, 0);
        } else {
            intValue10 = num11.intValue();
        }
        bVar16.T = Integer.valueOf(intValue10);
        b bVar17 = this.f14245b;
        Integer num12 = bVar.U;
        if (num12 == null) {
            intValue11 = f3.getDimensionPixelOffset(26, 0);
        } else {
            intValue11 = num12.intValue();
        }
        bVar17.U = Integer.valueOf(intValue11);
        b bVar18 = this.f14245b;
        Integer num13 = bVar.V;
        if (num13 == null) {
            intValue12 = f3.getDimensionPixelOffset(20, bVar18.T.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        bVar18.V = Integer.valueOf(intValue12);
        b bVar19 = this.f14245b;
        Integer num14 = bVar.W;
        if (num14 == null) {
            intValue13 = f3.getDimensionPixelOffset(27, bVar19.U.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        bVar19.W = Integer.valueOf(intValue13);
        b bVar20 = this.f14245b;
        Integer num15 = bVar.Z;
        if (num15 == null) {
            intValue14 = f3.getDimensionPixelOffset(21, 0);
        } else {
            intValue14 = num15.intValue();
        }
        bVar20.Z = Integer.valueOf(intValue14);
        b bVar21 = this.f14245b;
        Integer num16 = bVar.X;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        bVar21.X = Integer.valueOf(intValue15);
        b bVar22 = this.f14245b;
        Integer num17 = bVar.Y;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        bVar22.Y = Integer.valueOf(intValue16);
        b bVar23 = this.f14245b;
        Boolean bool2 = bVar.f14239a0;
        if (bool2 == null) {
            booleanValue = f3.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        bVar23.f14239a0 = Boolean.valueOf(booleanValue);
        f3.recycle();
        Locale locale2 = bVar.K;
        if (locale2 == null) {
            b bVar24 = this.f14245b;
            if (Build.VERSION.SDK_INT >= 24) {
                unused = Locale.Category.FORMAT;
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            bVar24.K = locale;
        } else {
            this.f14245b.K = locale2;
        }
        this.f14244a = bVar;
    }
}
