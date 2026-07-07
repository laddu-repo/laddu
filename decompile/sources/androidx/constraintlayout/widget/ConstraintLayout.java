package androidx.constraintlayout.widget;

import a0.d;
import a0.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import d0.c;
import d0.f;
import d0.g;
import d0.h;
import d0.o;
import d0.p;
import d0.q;
import d0.s;
import d0.t;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import j4.b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static t M;
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public o G;
    public b0 H;
    public int I;
    public HashMap J;
    public final SparseArray K;
    public final f L;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f843x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f844y;

    /* renamed from: z, reason: collision with root package name */
    public final e f845z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f843x = new SparseArray();
        this.f844y = new ArrayList(4);
        this.f845z = new e();
        this.A = 0;
        this.B = 0;
        this.C = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.E = true;
        this.F = 257;
        this.G = null;
        this.H = null;
        this.I = -1;
        this.J = new HashMap();
        this.K = new SparseArray();
        this.L = new f(this, this);
        i(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, d0.e] */
    public static d0.e g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f3500a = -1;
        marginLayoutParams.f3502b = -1;
        marginLayoutParams.f3504c = -1.0f;
        marginLayoutParams.f3506d = true;
        marginLayoutParams.f3508e = -1;
        marginLayoutParams.f3510f = -1;
        marginLayoutParams.f3512g = -1;
        marginLayoutParams.f3514h = -1;
        marginLayoutParams.f3516i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.f3519k = -1;
        marginLayoutParams.f3521l = -1;
        marginLayoutParams.f3523m = -1;
        marginLayoutParams.f3525n = -1;
        marginLayoutParams.f3527o = -1;
        marginLayoutParams.f3528p = -1;
        marginLayoutParams.f3530q = 0;
        marginLayoutParams.f3531r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        marginLayoutParams.s = -1;
        marginLayoutParams.f3532t = -1;
        marginLayoutParams.f3533u = -1;
        marginLayoutParams.f3534v = -1;
        marginLayoutParams.f3535w = Integer.MIN_VALUE;
        marginLayoutParams.f3536x = Integer.MIN_VALUE;
        marginLayoutParams.f3537y = Integer.MIN_VALUE;
        marginLayoutParams.f3538z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f3501a0 = true;
        marginLayoutParams.f3503b0 = true;
        marginLayoutParams.f3505c0 = false;
        marginLayoutParams.f3507d0 = false;
        marginLayoutParams.f3509e0 = false;
        marginLayoutParams.f3511f0 = -1;
        marginLayoutParams.f3513g0 = -1;
        marginLayoutParams.f3515h0 = -1;
        marginLayoutParams.f3517i0 = -1;
        marginLayoutParams.f3518j0 = Integer.MIN_VALUE;
        marginLayoutParams.f3520k0 = Integer.MIN_VALUE;
        marginLayoutParams.f3522l0 = 0.5f;
        marginLayoutParams.f3529p0 = new d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, d0.t] */
    public static t getSharedValues() {
        if (M == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            M = obj;
        }
        return M;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d0.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f844y;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((c) arrayList.get(i6)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((parseInt / 1080.0f) * width);
                        int i12 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i11;
                        float f10 = i12;
                        float f11 = i11 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f3, f10, f11, f10, paint);
                        float parseInt4 = i12 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f3, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f10, f11, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.E = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, d0.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f3500a = -1;
        marginLayoutParams.f3502b = -1;
        marginLayoutParams.f3504c = -1.0f;
        marginLayoutParams.f3506d = true;
        marginLayoutParams.f3508e = -1;
        marginLayoutParams.f3510f = -1;
        marginLayoutParams.f3512g = -1;
        marginLayoutParams.f3514h = -1;
        marginLayoutParams.f3516i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.f3519k = -1;
        marginLayoutParams.f3521l = -1;
        marginLayoutParams.f3523m = -1;
        marginLayoutParams.f3525n = -1;
        marginLayoutParams.f3527o = -1;
        marginLayoutParams.f3528p = -1;
        marginLayoutParams.f3530q = 0;
        marginLayoutParams.f3531r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        marginLayoutParams.s = -1;
        marginLayoutParams.f3532t = -1;
        marginLayoutParams.f3533u = -1;
        marginLayoutParams.f3534v = -1;
        marginLayoutParams.f3535w = Integer.MIN_VALUE;
        marginLayoutParams.f3536x = Integer.MIN_VALUE;
        marginLayoutParams.f3537y = Integer.MIN_VALUE;
        marginLayoutParams.f3538z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f3501a0 = true;
        marginLayoutParams.f3503b0 = true;
        marginLayoutParams.f3505c0 = false;
        marginLayoutParams.f3507d0 = false;
        marginLayoutParams.f3509e0 = false;
        marginLayoutParams.f3511f0 = -1;
        marginLayoutParams.f3513g0 = -1;
        marginLayoutParams.f3515h0 = -1;
        marginLayoutParams.f3517i0 = -1;
        marginLayoutParams.f3518j0 = Integer.MIN_VALUE;
        marginLayoutParams.f3520k0 = Integer.MIN_VALUE;
        marginLayoutParams.f3522l0 = 0.5f;
        marginLayoutParams.f3529p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f3645b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            int i10 = d0.d.f3499a.get(index);
            switch (i10) {
                case 1:
                    marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3528p);
                    marginLayoutParams.f3528p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f3528p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f3530q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3530q);
                    break;
                case 4:
                    float f3 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3531r) % 360.0f;
                    marginLayoutParams.f3531r = f3;
                    if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        marginLayoutParams.f3531r = (360.0f - f3) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f3500a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f3500a);
                    break;
                case 6:
                    marginLayoutParams.f3502b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f3502b);
                    break;
                case 7:
                    marginLayoutParams.f3504c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f3504c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3508e);
                    marginLayoutParams.f3508e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f3508e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3510f);
                    marginLayoutParams.f3510f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f3510f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3512g);
                    marginLayoutParams.f3512g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f3512g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3514h);
                    marginLayoutParams.f3514h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f3514h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3516i);
                    marginLayoutParams.f3516i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f3516i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3519k);
                    marginLayoutParams.f3519k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f3519k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3521l);
                    marginLayoutParams.f3521l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f3521l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3523m);
                    marginLayoutParams.f3523m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f3523m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.s);
                    marginLayoutParams.s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3532t);
                    marginLayoutParams.f3532t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f3532t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3533u);
                    marginLayoutParams.f3533u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f3533u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3534v);
                    marginLayoutParams.f3534v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f3534v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f3535w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3535w);
                    break;
                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                    marginLayoutParams.f3536x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3536x);
                    break;
                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                    marginLayoutParams.f3537y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3537y);
                    break;
                case 24:
                    marginLayoutParams.f3538z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f3538z);
                    break;
                case 25:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case 26:
                    marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);
                    break;
                case 27:
                    marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);
                    break;
                case 28:
                    marginLayoutParams.X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.X);
                    break;
                case 29:
                    marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);
                    break;
                case 30:
                    marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);
                    break;
                case 31:
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.M = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) == -2) {
                            marginLayoutParams.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) == -2) {
                            marginLayoutParams.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.R = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
                    marginLayoutParams.L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) == -2) {
                            marginLayoutParams.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Q) == -2) {
                            marginLayoutParams.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.S = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i10) {
                        case 44:
                            o.i(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);
                            break;
                        case 46:
                            marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);
                            break;
                        case 47:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);
                            break;
                        case 50:
                            marginLayoutParams.U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.U);
                            break;
                        case 51:
                            marginLayoutParams.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3525n);
                            marginLayoutParams.f3525n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.f3525n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f3527o);
                            marginLayoutParams.f3527o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.f3527o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.D);
                            break;
                        case 55:
                            marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);
                            break;
                        default:
                            switch (i10) {
                                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                    o.h(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.h(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    break;
                                case 67:
                                    marginLayoutParams.f3506d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f3506d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.D;
    }

    public int getMaxWidth() {
        return this.C;
    }

    public int getMinHeight() {
        return this.B;
    }

    public int getMinWidth() {
        return this.A;
    }

    public int getOptimizationLevel() {
        return this.f845z.D0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f845z;
        if (eVar.j == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.j = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.j = "parent";
            }
        }
        if (eVar.f45h0 == null) {
            eVar.f45h0 = eVar.j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f45h0);
        }
        ArrayList arrayList = eVar.f69q0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            d dVar = (d) obj;
            View view = dVar.f41f0;
            if (view != null) {
                if (dVar.j == null && (id2 = view.getId()) != -1) {
                    dVar.j = getContext().getResources().getResourceEntryName(id2);
                }
                if (dVar.f45h0 == null) {
                    dVar.f45h0 = dVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f45h0);
                }
            }
        }
        eVar.n(sb2);
        return sb2.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f845z;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof d0.e) {
                return ((d0.e) view.getLayoutParams()).f3529p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof d0.e) {
                return ((d0.e) view.getLayoutParams()).f3529p0;
            }
            return null;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i6) {
        e eVar = this.f845z;
        eVar.f41f0 = this;
        f fVar = this.L;
        eVar.f73u0 = fVar;
        eVar.f71s0.f1234h = fVar;
        this.f843x.put(getId(), this);
        this.G = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f3645b, i6, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                } else if (index == 17) {
                    this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                } else if (index == 14) {
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                } else if (index == 15) {
                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                } else if (index == 113) {
                    this.F = obtainStyledAttributes.getInt(index, this.F);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.H = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.G = oVar;
                        oVar.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.G = null;
                    }
                    this.I = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.D0 = this.F;
        y.c.f14774q = eVar.W(512);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j4.b0] */
    public final void j(int i6) {
        String str;
        Context context = getContext();
        ?? obj = new Object();
        obj.f7158x = new SparseArray();
        obj.f7159y = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            g gVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                obj.y(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                g gVar2 = new g(context, xml);
                                ((SparseArray) obj.f7158x).put(gVar2.f3547x, gVar2);
                                gVar = gVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                h hVar = new h(context, xml);
                                if (gVar != null) {
                                    ((ArrayList) gVar.f3549z).add(hVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                    name.equals(str);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i6, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i6, e11);
        }
        this.H = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(a0.e r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(a0.e, int, int, int):void");
    }

    public final void l(d dVar, d0.e eVar, SparseArray sparseArray, int i6, int i10) {
        View view = (View) this.f843x.get(i6);
        d dVar2 = (d) sparseArray.get(i6);
        if (dVar2 != null && view != null && (view.getLayoutParams() instanceof d0.e)) {
            eVar.f3505c0 = true;
            if (i10 == 6) {
                d0.e eVar2 = (d0.e) view.getLayoutParams();
                eVar2.f3505c0 = true;
                eVar2.f3529p0.E = true;
            }
            dVar.i(6).b(dVar2.i(i10), eVar.D, eVar.C, true);
            dVar.E = true;
            dVar.i(3).j();
            dVar.i(5).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            d0.e eVar = (d0.e) childAt.getLayoutParams();
            d dVar = eVar.f3529p0;
            if (childAt.getVisibility() != 8 || eVar.f3507d0 || eVar.f3509e0 || isInEditMode) {
                int r10 = dVar.r();
                int s = dVar.s();
                childAt.layout(r10, s, dVar.q() + r10, dVar.k() + s);
            }
        }
        ArrayList arrayList = this.f844y;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((c) arrayList.get(i14)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:307:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x040c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d h4 = h(view);
        if ((view instanceof q) && !(h4 instanceof a0.h)) {
            d0.e eVar = (d0.e) view.getLayoutParams();
            a0.h hVar = new a0.h();
            eVar.f3529p0 = hVar;
            eVar.f3507d0 = true;
            hVar.S(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((d0.e) view.getLayoutParams()).f3509e0 = true;
            ArrayList arrayList = this.f844y;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f843x.put(view.getId(), view);
        this.E = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f843x.remove(view.getId());
        d h4 = h(view);
        this.f845z.f69q0.remove(h4);
        h4.C();
        this.f844y.remove(view);
        this.E = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.E = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.G = oVar;
    }

    @Override // android.view.View
    public void setId(int i6) {
        int id2 = getId();
        SparseArray sparseArray = this.f843x;
        sparseArray.remove(id2);
        super.setId(i6);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i6) {
        if (i6 == this.D) {
            return;
        }
        this.D = i6;
        requestLayout();
    }

    public void setMaxWidth(int i6) {
        if (i6 == this.C) {
            return;
        }
        this.C = i6;
        requestLayout();
    }

    public void setMinHeight(int i6) {
        if (i6 == this.B) {
            return;
        }
        this.B = i6;
        requestLayout();
    }

    public void setMinWidth(int i6) {
        if (i6 == this.A) {
            return;
        }
        this.A = i6;
        requestLayout();
    }

    public void setOnConstraintsChanged(p pVar) {
        b0 b0Var = this.H;
        if (b0Var != null) {
            b0Var.getClass();
        }
    }

    public void setOptimizationLevel(int i6) {
        this.F = i6;
        e eVar = this.f845z;
        eVar.D0 = i6;
        y.c.f14774q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f843x = new SparseArray();
        this.f844y = new ArrayList(4);
        this.f845z = new e();
        this.A = 0;
        this.B = 0;
        this.C = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.E = true;
        this.F = 257;
        this.G = null;
        this.H = null;
        this.I = -1;
        this.J = new HashMap();
        this.K = new SparseArray();
        this.L = new f(this, this);
        i(attributeSet, i6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, d0.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f3500a = -1;
        marginLayoutParams.f3502b = -1;
        marginLayoutParams.f3504c = -1.0f;
        marginLayoutParams.f3506d = true;
        marginLayoutParams.f3508e = -1;
        marginLayoutParams.f3510f = -1;
        marginLayoutParams.f3512g = -1;
        marginLayoutParams.f3514h = -1;
        marginLayoutParams.f3516i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.f3519k = -1;
        marginLayoutParams.f3521l = -1;
        marginLayoutParams.f3523m = -1;
        marginLayoutParams.f3525n = -1;
        marginLayoutParams.f3527o = -1;
        marginLayoutParams.f3528p = -1;
        marginLayoutParams.f3530q = 0;
        marginLayoutParams.f3531r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        marginLayoutParams.s = -1;
        marginLayoutParams.f3532t = -1;
        marginLayoutParams.f3533u = -1;
        marginLayoutParams.f3534v = -1;
        marginLayoutParams.f3535w = Integer.MIN_VALUE;
        marginLayoutParams.f3536x = Integer.MIN_VALUE;
        marginLayoutParams.f3537y = Integer.MIN_VALUE;
        marginLayoutParams.f3538z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f3501a0 = true;
        marginLayoutParams.f3503b0 = true;
        marginLayoutParams.f3505c0 = false;
        marginLayoutParams.f3507d0 = false;
        marginLayoutParams.f3509e0 = false;
        marginLayoutParams.f3511f0 = -1;
        marginLayoutParams.f3513g0 = -1;
        marginLayoutParams.f3515h0 = -1;
        marginLayoutParams.f3517i0 = -1;
        marginLayoutParams.f3518j0 = Integer.MIN_VALUE;
        marginLayoutParams.f3520k0 = Integer.MIN_VALUE;
        marginLayoutParams.f3522l0 = 0.5f;
        marginLayoutParams.f3529p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (!(layoutParams instanceof d0.e)) {
            return marginLayoutParams;
        }
        d0.e eVar = (d0.e) layoutParams;
        marginLayoutParams.f3500a = eVar.f3500a;
        marginLayoutParams.f3502b = eVar.f3502b;
        marginLayoutParams.f3504c = eVar.f3504c;
        marginLayoutParams.f3506d = eVar.f3506d;
        marginLayoutParams.f3508e = eVar.f3508e;
        marginLayoutParams.f3510f = eVar.f3510f;
        marginLayoutParams.f3512g = eVar.f3512g;
        marginLayoutParams.f3514h = eVar.f3514h;
        marginLayoutParams.f3516i = eVar.f3516i;
        marginLayoutParams.j = eVar.j;
        marginLayoutParams.f3519k = eVar.f3519k;
        marginLayoutParams.f3521l = eVar.f3521l;
        marginLayoutParams.f3523m = eVar.f3523m;
        marginLayoutParams.f3525n = eVar.f3525n;
        marginLayoutParams.f3527o = eVar.f3527o;
        marginLayoutParams.f3528p = eVar.f3528p;
        marginLayoutParams.f3530q = eVar.f3530q;
        marginLayoutParams.f3531r = eVar.f3531r;
        marginLayoutParams.s = eVar.s;
        marginLayoutParams.f3532t = eVar.f3532t;
        marginLayoutParams.f3533u = eVar.f3533u;
        marginLayoutParams.f3534v = eVar.f3534v;
        marginLayoutParams.f3535w = eVar.f3535w;
        marginLayoutParams.f3536x = eVar.f3536x;
        marginLayoutParams.f3537y = eVar.f3537y;
        marginLayoutParams.f3538z = eVar.f3538z;
        marginLayoutParams.A = eVar.A;
        marginLayoutParams.B = eVar.B;
        marginLayoutParams.C = eVar.C;
        marginLayoutParams.D = eVar.D;
        marginLayoutParams.E = eVar.E;
        marginLayoutParams.F = eVar.F;
        marginLayoutParams.G = eVar.G;
        marginLayoutParams.H = eVar.H;
        marginLayoutParams.I = eVar.I;
        marginLayoutParams.J = eVar.J;
        marginLayoutParams.K = eVar.K;
        marginLayoutParams.W = eVar.W;
        marginLayoutParams.X = eVar.X;
        marginLayoutParams.L = eVar.L;
        marginLayoutParams.M = eVar.M;
        marginLayoutParams.N = eVar.N;
        marginLayoutParams.P = eVar.P;
        marginLayoutParams.O = eVar.O;
        marginLayoutParams.Q = eVar.Q;
        marginLayoutParams.R = eVar.R;
        marginLayoutParams.S = eVar.S;
        marginLayoutParams.T = eVar.T;
        marginLayoutParams.U = eVar.U;
        marginLayoutParams.V = eVar.V;
        marginLayoutParams.f3501a0 = eVar.f3501a0;
        marginLayoutParams.f3503b0 = eVar.f3503b0;
        marginLayoutParams.f3505c0 = eVar.f3505c0;
        marginLayoutParams.f3507d0 = eVar.f3507d0;
        marginLayoutParams.f3511f0 = eVar.f3511f0;
        marginLayoutParams.f3513g0 = eVar.f3513g0;
        marginLayoutParams.f3515h0 = eVar.f3515h0;
        marginLayoutParams.f3517i0 = eVar.f3517i0;
        marginLayoutParams.f3518j0 = eVar.f3518j0;
        marginLayoutParams.f3520k0 = eVar.f3520k0;
        marginLayoutParams.f3522l0 = eVar.f3522l0;
        marginLayoutParams.Y = eVar.Y;
        marginLayoutParams.Z = eVar.Z;
        marginLayoutParams.f3529p0 = eVar.f3529p0;
        return marginLayoutParams;
    }
}
