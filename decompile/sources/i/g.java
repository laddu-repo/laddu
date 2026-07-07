package i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final d f6209a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6210b;

    public g(Context context) {
        this(context, h.e(context, 0));
    }

    public h create() {
        int i6;
        d dVar = this.f6209a;
        h hVar = new h(dVar.f6158a, this.f6210b);
        View view = dVar.f6162e;
        f fVar = hVar.C;
        if (view != null) {
            fVar.A = view;
        } else {
            CharSequence charSequence = dVar.f6161d;
            if (charSequence != null) {
                fVar.f6180d = charSequence;
                TextView textView = fVar.f6199y;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.f6160c;
            if (drawable != null) {
                fVar.f6197w = drawable;
                ImageView imageView = fVar.f6198x;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.f6198x.setImageDrawable(drawable);
                }
            }
        }
        String str = dVar.f6163f;
        if (str != null) {
            fVar.f6181e = str;
            TextView textView2 = fVar.f6200z;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = dVar.f6164g;
        if (charSequence2 != null) {
            fVar.d(-1, charSequence2, dVar.f6165h);
        }
        CharSequence charSequence3 = dVar.f6166i;
        if (charSequence3 != null) {
            fVar.d(-2, charSequence3, dVar.j);
        }
        if (dVar.f6169m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dVar.f6159b.inflate(fVar.E, (ViewGroup) null);
            if (dVar.f6172p) {
                i6 = fVar.F;
            } else {
                i6 = fVar.G;
            }
            ListAdapter listAdapter = dVar.f6169m;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(dVar.f6158a, i6, R.id.text1, (Object[]) null);
            }
            fVar.B = listAdapter;
            fVar.C = dVar.f6173q;
            if (dVar.f6170n != null) {
                alertController$RecycleListView.setOnItemClickListener(new c(dVar, fVar));
            }
            if (dVar.f6172p) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.f6182f = alertController$RecycleListView;
        }
        View view2 = dVar.f6171o;
        if (view2 != null) {
            fVar.f6183g = view2;
            fVar.f6187l = false;
        }
        hVar.setCancelable(dVar.f6167k);
        if (dVar.f6167k) {
            hVar.setCanceledOnTouchOutside(true);
        }
        hVar.setOnCancelListener(null);
        hVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = dVar.f6168l;
        if (onKeyListener != null) {
            hVar.setOnKeyListener(onKeyListener);
        }
        return hVar;
    }

    public Context getContext() {
        return this.f6209a.f6158a;
    }

    public g setNegativeButton(int i6, DialogInterface.OnClickListener onClickListener) {
        d dVar = this.f6209a;
        dVar.f6166i = dVar.f6158a.getText(i6);
        dVar.j = onClickListener;
        return this;
    }

    public g setPositiveButton(int i6, DialogInterface.OnClickListener onClickListener) {
        d dVar = this.f6209a;
        dVar.f6164g = dVar.f6158a.getText(i6);
        dVar.f6165h = onClickListener;
        return this;
    }

    public g setTitle(CharSequence charSequence) {
        this.f6209a.f6161d = charSequence;
        return this;
    }

    public g setView(View view) {
        this.f6209a.f6171o = view;
        return this;
    }

    public g(Context context, int i6) {
        this.f6209a = new d(new ContextThemeWrapper(context, h.e(context, i6)));
        this.f6210b = i6;
    }
}
