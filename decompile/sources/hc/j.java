package hc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final /* synthetic */ k D;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MaterialCardView f6232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f6233v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f6234w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f6235x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f6236y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f6237z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, View view) {
        super(view);
        this.D = kVar;
        this.f6232u = (MaterialCardView) view.findViewById(fc.l.event_card);
        this.f6236y = (TextView) view.findViewById(fc.l.teamAName);
        this.f6237z = (TextView) view.findViewById(fc.l.teamBName);
        this.f6234w = (ImageView) view.findViewById(fc.l.teamAFlag);
        this.f6235x = (ImageView) view.findViewById(fc.l.teamBFlag);
        this.f6233v = (ImageView) view.findViewById(fc.l.event_logo);
        this.A = (TextView) view.findViewById(fc.l.event_text);
        this.B = (TextView) view.findViewById(fc.l.date_text);
        this.C = (TextView) view.findViewById(fc.l.hotLabel);
    }
}
