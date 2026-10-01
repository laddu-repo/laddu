package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.playfy.tv.R;
import java.util.Calendar;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends BaseAdapter {
    public static final int A = y.c(null).getMaximum(4);
    public static final int B = (y.c(null).getMaximum(7) + y.c(null).getMaximum(5)) - 1;

    /* renamed from: x, reason: collision with root package name */
    public final r f2691x;

    /* renamed from: y, reason: collision with root package name */
    public c f2692y;

    /* renamed from: z, reason: collision with root package name */
    public final b f2693z;

    public s(r rVar, b bVar) {
        this.f2691x = rVar;
        this.f2693z = bVar;
        throw null;
    }

    public final int a() {
        int i6 = this.f2693z.B;
        r rVar = this.f2691x;
        Calendar calendar = rVar.f2688x;
        int i10 = calendar.get(7);
        if (i6 <= 0) {
            i6 = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - i6;
        if (i11 < 0) {
            return i11 + rVar.A;
        }
        return i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i6) {
        if (i6 >= a() && i6 <= c()) {
            int a10 = (i6 - a()) + 1;
            Calendar a11 = y.a(this.f2691x.f2688x);
            a11.set(5, a10);
            return Long.valueOf(a11.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.f2691x.B) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return B;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6 / this.f2691x.A;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f2692y == null) {
            this.f2692y = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a10 = i6 - a();
        if (a10 >= 0) {
            r rVar = this.f2691x;
            if (a10 < rVar.B) {
                textView.setTag(rVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a10 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i6) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                y.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i6) == null) {
            textView.getContext();
            y.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
