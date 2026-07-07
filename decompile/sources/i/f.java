package i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.playfy.tv.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {
    public View A;
    public ListAdapter B;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final f2.c I;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6177a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6178b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f6179c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f6180d;

    /* renamed from: e, reason: collision with root package name */
    public String f6181e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f6182f;

    /* renamed from: g, reason: collision with root package name */
    public View f6183g;

    /* renamed from: h, reason: collision with root package name */
    public int f6184h;

    /* renamed from: i, reason: collision with root package name */
    public int f6185i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f6186k;

    /* renamed from: m, reason: collision with root package name */
    public Button f6188m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f6189n;

    /* renamed from: o, reason: collision with root package name */
    public Message f6190o;

    /* renamed from: p, reason: collision with root package name */
    public Button f6191p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f6192q;

    /* renamed from: r, reason: collision with root package name */
    public Message f6193r;
    public Button s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f6194t;

    /* renamed from: u, reason: collision with root package name */
    public Message f6195u;

    /* renamed from: v, reason: collision with root package name */
    public NestedScrollView f6196v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f6197w;

    /* renamed from: x, reason: collision with root package name */
    public ImageView f6198x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f6199y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f6200z;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6187l = false;
    public int C = -1;
    public final com.google.android.material.datepicker.l J = new com.google.android.material.datepicker.l(this, 1);

    public f(Context context, h hVar, Window window) {
        this.f6177a = context;
        this.f6178b = hVar;
        this.f6179c = window;
        f2.c cVar = new f2.c();
        cVar.f4640b = new WeakReference(hVar);
        this.I = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, h.a.f5736e, R.attr.alertDialogStyle, 0);
        this.D = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.E = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.F = obtainStyledAttributes.getResourceId(7, 0);
        this.G = obtainStyledAttributes.getResourceId(3, 0);
        this.H = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        hVar.c().f(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        int i6;
        int i10 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            view2.setVisibility(i6);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i10 = 0;
            }
            view3.setVisibility(i10);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i6, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.I.obtainMessage(i6, onClickListener);
        } else {
            message = null;
        }
        if (i6 != -3) {
            if (i6 != -2) {
                if (i6 == -1) {
                    this.f6189n = charSequence;
                    this.f6190o = message;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f6192q = charSequence;
            this.f6193r = message;
            return;
        }
        this.f6194t = charSequence;
        this.f6195u = message;
    }
}
