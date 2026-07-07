package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.playfy.tv.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {
    public static final int A;

    /* renamed from: x, reason: collision with root package name */
    public final Calendar f2657x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2658y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2659z;

    static {
        int i6;
        if (Build.VERSION.SDK_INT >= 26) {
            i6 = 4;
        } else {
            i6 = 1;
        }
        A = i6;
    }

    public e() {
        Calendar c10 = y.c(null);
        this.f2657x = c10;
        this.f2658y = c10.getMaximum(7);
        this.f2659z = c10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2658y;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        int i10 = this.f2658y;
        if (i6 >= i10) {
            return null;
        }
        int i11 = i6 + this.f2659z;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i6 + this.f2659z;
        int i11 = this.f2658y;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f2657x;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, A, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i6) {
        Calendar c10 = y.c(null);
        this.f2657x = c10;
        this.f2658y = c10.getMaximum(7);
        this.f2659z = i6;
    }
}
