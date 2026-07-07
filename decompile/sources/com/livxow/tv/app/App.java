package com.livxow.tv.app;

import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import com.livxow.tv.activities.LandscapeActivity;
import fa.g;
import h.j;
import java.util.ArrayList;
import java.util.List;
import pc.a;
import pc.e;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class App extends Application {
    public static App P;
    public List A;
    public List B;
    public ArrayList C;
    public ArrayList D;
    public ArrayList E;
    public e F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public int O;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f3685v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f3686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LandscapeActivity f3687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public pa.a f3688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ic.a f3689z;

    public final void a(RecyclerView recyclerView) {
        if (this.O < 0) {
            return;
        }
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.O);
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        P = this;
        g.f(getApplicationContext());
    }
}
