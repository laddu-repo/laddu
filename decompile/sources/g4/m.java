package g4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.ArrayList;
import java.util.List;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o4.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5516d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5517e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5519h;

    public m(Context context, ArrayList arrayList, mc.h hVar) {
        this.f5517e = context;
        this.f = new ArrayList(arrayList);
        this.f5518g = hVar;
    }

    @Override // o4.b0
    public final int a() {
        switch (this.f5516d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((String[]) this.f5517e).length;
            case 1:
                return ((List) this.f5518g).size();
            default:
                return ((ArrayList) this.f).size();
        }
    }

    @Override // o4.b0
    public final long b(int i) {
        switch (this.f5516d) {
        }
        return i;
    }

    @Override // o4.b0
    public int c(int i) {
        switch (this.f5516d) {
            case 1:
            case 2:
                return i;
            default:
                return super.c(i);
        }
    }

    @Override // o4.b0
    public final void d(z0 z0Var, int i) {
        switch (this.f5516d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                l lVar = (l) z0Var;
                View view = lVar.f9910a;
                if (g(i)) {
                    view.setLayoutParams(new o4.k0(-1, -2));
                } else {
                    view.setLayoutParams(new o4.k0(0, 0));
                }
                TextView textView = lVar.f5512u;
                ImageView imageView = lVar.f5514w;
                TextView textView2 = lVar.f5513v;
                textView.setText(((String[]) this.f5517e)[i]);
                String str = ((String[]) this.f)[i];
                if (str == null) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str);
                }
                Drawable drawable = ((Drawable[]) this.f5518g)[i];
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                } else {
                    imageView.setVisibility(8);
                }
                break;
            case 1:
                hc.b bVar = (hc.b) z0Var;
                pc.b bVar2 = (pc.b) ((List) this.f5518g).get(i);
                String str2 = bVar2.f10483a;
                TextView textView3 = bVar.f6206v;
                textView3.setText(str2);
                textView3.setSelected(true);
                ((com.bumptech.glide.m) com.bumptech.glide.b.e((Context) this.f5517e).n(bVar2.f10484b).i(fc.k.icon)).v(bVar.f6207w);
                bVar.f6205u.setOnClickListener(new hc.a(this, bVar2, str2, 0));
                break;
            default:
                hc.i iVar = (hc.i) z0Var;
                MaterialCardView materialCardView = iVar.f6228u;
                TextView textView4 = iVar.f6230w;
                if (((hc.i) this.f5519h) == null && i == 0) {
                    textView4.setVisibility(0);
                    materialCardView.setSelected(true);
                    this.f5519h = iVar;
                }
                pc.d dVar = (pc.d) ((ArrayList) this.f).get(i);
                ShapeableImageView shapeableImageView = iVar.f6229v;
                textView4.setText(dVar.f10492a);
                textView4.setSelected(true);
                iVar.f6231x.setText(String.valueOf(dVar.f10494c));
                if (dVar.f10492a.equalsIgnoreCase("All")) {
                    shapeableImageView.setImageResource(fc.k.ic_all);
                } else {
                    ((com.bumptech.glide.m) com.bumptech.glide.b.e((Context) this.f5517e).n(dVar.f10493b).i(fc.k.icon)).v(shapeableImageView);
                }
                materialCardView.setOnClickListener(new hc.a(this, iVar, dVar, 1));
                break;
        }
    }

    @Override // o4.b0
    public final z0 e(ViewGroup viewGroup, int i) {
        switch (this.f5516d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                r rVar = (r) this.f5519h;
                return new l(rVar, LayoutInflater.from(rVar.getContext()).inflate(i0.exo_styled_settings_list_item, viewGroup, false));
            case 1:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(fc.m.item_category, viewGroup, false);
                hc.b bVar = new hc.b(viewInflate);
                bVar.f6205u = (MaterialCardView) viewInflate.findViewById(fc.l.category_card);
                bVar.f6206v = (TextView) viewInflate.findViewById(fc.l.category_text_view);
                bVar.f6207w = (CircleImageView) viewInflate.findViewById(fc.l.category_img);
                return bVar;
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(fc.m.item_event_home, viewGroup, false);
                hc.i iVar = new hc.i(viewInflate2);
                iVar.f6228u = (MaterialCardView) viewInflate2.findViewById(fc.l.card);
                iVar.f6229v = (ShapeableImageView) viewInflate2.findViewById(fc.l.image);
                iVar.f6230w = (TextView) viewInflate2.findViewById(fc.l.txtSportName);
                iVar.f6231x = (TextView) viewInflate2.findViewById(fc.l.txtEventCount);
                return iVar;
        }
    }

    public boolean g(int i) {
        r rVar = (r) this.f5519h;
        t1.n0 n0Var = rVar.C0;
        if (n0Var == null) {
            return false;
        }
        if (i == 0) {
            return ((c3.e) n0Var).n(13);
        }
        if (i != 1) {
            return true;
        }
        return ((c3.e) n0Var).n(30) && ((c3.e) rVar.C0).n(29);
    }

    public m(Context context, androidx.fragment.app.q0 q0Var, mc.b bVar, ArrayList arrayList) {
        this.f5517e = context;
        this.f5519h = bVar;
        this.f5518g = arrayList;
        this.f = q0Var;
    }

    public m(r rVar, String[] strArr, Drawable[] drawableArr) {
        this.f5519h = rVar;
        this.f5517e = strArr;
        this.f = new String[strArr.length];
        this.f5518g = drawableArr;
    }
}
