package fd;

import android.widget.ImageButton;
import android.widget.ImageView;
import com.playfy.tv.R;
import com.playfy.tv.activities.PlayerActivity;
import com.playfy.tv.databinding.ActivityPlayerBinding;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends ne.j implements ve.p {
    public final /* synthetic */ PlayerActivity A;
    public final /* synthetic */ int B;

    /* renamed from: x, reason: collision with root package name */
    public PlayerActivity f5220x;

    /* renamed from: y, reason: collision with root package name */
    public int f5221y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f5222z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z10, PlayerActivity playerActivity, int i6, le.c cVar) {
        super(2, cVar);
        this.f5222z = z10;
        this.A = playerActivity;
        this.B = i6;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        return new y(this.f5222z, this.A, this.B, cVar);
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6;
        PlayerActivity playerActivity;
        boolean z10;
        int i10 = this.f5221y;
        if (i10 != 0) {
            if (i10 == 1) {
                playerActivity = this.f5220x;
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            int i11 = this.B;
            boolean z11 = this.f5222z;
            PlayerActivity playerActivity2 = this.A;
            if (z11) {
                bf.o[] oVarArr = PlayerActivity.V;
                Object value = playerActivity2.N.getValue();
                kotlin.jvm.internal.k.d(value, "getValue(...)");
                ImageButton imageButton = (ImageButton) value;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                imageButton.setSelected(z10);
            }
            bf.o[] oVarArr2 = PlayerActivity.V;
            ActivityPlayerBinding Y = playerActivity2.Y();
            k4.q qVar = Y.j.I;
            if (qVar != null && qVar.j()) {
                Y.j.d();
            }
            ImageView imageView = Y.f3155c;
            if (z11) {
                if (i11 == 0) {
                    i6 = R.drawable.ic_volume_off;
                } else if (1 <= i11 && i11 < 50) {
                    i6 = R.drawable.ic_volume_low;
                } else {
                    i6 = R.drawable.ic_volume_up;
                }
            } else if (i11 == 0) {
                i6 = R.drawable.ic_brightness_off;
            } else if (1 <= i11 && i11 < 50) {
                i6 = R.drawable.ic_brightness_half;
            } else {
                i6 = R.drawable.ic_brightness;
            }
            imageView.setImageResource(i6);
            Y.f3156d.setText(i11 + "%");
            playerActivity2.Y().f3168q.setVisibility(0);
            this.f5220x = playerActivity2;
            this.f5221y = 1;
            Object k8 = gf.f0.k(1000L, this);
            me.a aVar = me.a.f8833x;
            if (k8 == aVar) {
                return aVar;
            }
            playerActivity = playerActivity2;
        }
        bf.o[] oVarArr3 = PlayerActivity.V;
        playerActivity.Y().f3168q.setVisibility(8);
        return he.y.f6101a;
    }
}
