package h;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5919b;

    public f(Context context) {
        this(context, g.h(context, 0));
    }

    public final g a() {
        g gVarCreate = create();
        gVarCreate.show();
        return gVarCreate;
    }

    public g create() {
        b bVar = this.f5918a;
        g gVar = new g(bVar.f5836a, this.f5919b);
        View view = bVar.f5840e;
        e eVar = gVar.B;
        if (view != null) {
            eVar.f5913w = view;
        } else {
            CharSequence charSequence = bVar.f5839d;
            if (charSequence != null) {
                eVar.f5896d = charSequence;
                TextView textView = eVar.f5911u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f5838c;
            if (drawable != null) {
                eVar.f5909s = drawable;
                ImageView imageView = eVar.f5910t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f5910t.setImageDrawable(drawable);
                }
            }
        }
        String str = bVar.f;
        if (str != null) {
            eVar.f5897e = str;
            TextView textView2 = eVar.f5912v;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = bVar.f5841g;
        if (charSequence2 != null) {
            eVar.c(-1, charSequence2, bVar.f5842h);
        }
        CharSequence charSequence3 = bVar.i;
        if (charSequence3 != null) {
            eVar.c(-2, charSequence3, bVar.f5843j);
        }
        if (bVar.f5847n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f5837b.inflate(eVar.A, (ViewGroup) null);
            int i = bVar.f5850q ? eVar.B : eVar.C;
            ListAdapter dVar = bVar.f5847n;
            if (dVar == null) {
                dVar = new d(bVar.f5836a, i, R.id.text1, null);
            }
            eVar.f5914x = dVar;
            eVar.f5915y = bVar.f5851r;
            if (bVar.f5848o != null) {
                alertController$RecycleListView.setOnItemClickListener(new a(bVar, eVar));
            }
            if (bVar.f5850q) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f = alertController$RecycleListView;
        }
        View view2 = bVar.f5849p;
        if (view2 != null) {
            eVar.f5898g = view2;
            eVar.f5899h = false;
        }
        gVar.setCancelable(bVar.f5844k);
        if (bVar.f5844k) {
            gVar.setCanceledOnTouchOutside(true);
        }
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(bVar.f5845l);
        n.m mVar = bVar.f5846m;
        if (mVar != null) {
            gVar.setOnKeyListener(mVar);
        }
        return gVar;
    }

    public Context getContext() {
        return this.f5918a.f5836a;
    }

    public f setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        b bVar = this.f5918a;
        bVar.i = bVar.f5836a.getText(i);
        bVar.f5843j = onClickListener;
        return this;
    }

    public f setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        b bVar = this.f5918a;
        bVar.f5841g = bVar.f5836a.getText(i);
        bVar.f5842h = onClickListener;
        return this;
    }

    public f setTitle(CharSequence charSequence) {
        this.f5918a.f5839d = charSequence;
        return this;
    }

    public f setView(View view) {
        this.f5918a.f5849p = view;
        return this;
    }

    public f(Context context, int i) {
        this.f5918a = new b(new ContextThemeWrapper(context, g.h(context, i)));
        this.f5919b = i;
    }
}
