package h;

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
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final c E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f5894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f5895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f5896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5897e;
    public AlertController$RecycleListView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f5898g;
    public Button i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f5900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Message f5901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f5902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f5903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Message f5904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f5905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f5906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f5907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollView f5908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f5909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f5910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f5911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f5912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f5913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f5914x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f5916z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5899h = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5915y = -1;
    public final com.google.android.material.datepicker.l F = new com.google.android.material.datepicker.l(2, this);

    public e(Context context, g gVar, Window window) {
        this.f5893a = context;
        this.f5894b = gVar;
        this.f5895c = window;
        c cVar = new c();
        cVar.f5853b = new WeakReference(gVar);
        this.E = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, g.j.AlertDialog, g.a.alertDialogStyle, 0);
        this.f5916z = typedArrayObtainStyledAttributes.getResourceId(g.j.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(g.j.AlertDialog_buttonPanelSideLayout, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(g.j.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(g.j.AlertDialog_multiChoiceItemLayout, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(g.j.AlertDialog_singleChoiceItemLayout, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(g.j.AlertDialog_listItemLayout, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(g.j.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(g.j.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.e().g(1);
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

    public static ViewGroup b(View view, View view2) {
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

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f5906p = charSequence;
            this.f5907q = messageObtainMessage;
        } else if (i == -2) {
            this.f5903m = charSequence;
            this.f5904n = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f5900j = charSequence;
            this.f5901k = messageObtainMessage;
        }
    }
}
