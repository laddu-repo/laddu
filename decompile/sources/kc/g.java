package kc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ArrayAdapter {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f7913v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Context context, int i, int i10, ArrayList arrayList) {
        super(context, i, i10, arrayList);
        this.f7913v = hVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(fc.l.choose_txt);
        h hVar = this.f7913v;
        if (i == hVar.M0) {
            textView.setTextColor(hVar.O0);
            return view2;
        }
        textView.setTextColor(hVar.N0);
        return view2;
    }
}
