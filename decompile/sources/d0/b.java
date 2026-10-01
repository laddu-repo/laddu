package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3489a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3490b;

    /* renamed from: c, reason: collision with root package name */
    public int f3491c;

    /* renamed from: d, reason: collision with root package name */
    public float f3492d;

    /* renamed from: e, reason: collision with root package name */
    public String f3493e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3494f;

    /* renamed from: g, reason: collision with root package name */
    public int f3495g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f3490b = bVar.f3490b;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, d0.b] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f3647d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i6 = 0;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i6 = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i6 = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i6 = 4;
            } else {
                if (index == 7) {
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                } else if (index == 5) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    i6 = 2;
                } else if (index == 6) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    i6 = 1;
                } else if (index == 9) {
                    obj = obtainStyledAttributes.getString(index);
                    i6 = 5;
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                    i6 = 8;
                }
                i6 = 7;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f3490b = i6;
            obj2.f3489a = z10;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (y.e.c(this.f3490b)) {
            case 0:
            case 7:
                this.f3491c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f3492d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f3495g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f3493e = (String) obj;
                return;
            case 5:
                this.f3494f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f3492d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
