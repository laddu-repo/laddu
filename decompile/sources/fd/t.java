package fd;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetUnknownHostException;
import com.drake.net.exception.NetworkingException;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.playfy.tv.R;
import com.playfy.tv.activities.PlayerActivity;
import com.playfy.tv.databinding.ActivityPlayerBinding;
import com.playfy.tv.databinding.ErrorLyBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.p0;
import kf.f1;
import p.q3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5212x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f5213y;

    public /* synthetic */ t(PlayerActivity playerActivity, int i6) {
        this.f5212x = i6;
        this.f5213y = playerActivity;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        boolean z10;
        int i6;
        CountDownTimer countDownTimer;
        boolean z11;
        boolean z12;
        int i10 = this.f5212x;
        List list = ie.r.f6846x;
        int i11 = 8;
        List list2 = null;
        int i12 = 1;
        he.y yVar = he.y.f6101a;
        PlayerActivity playerActivity = this.f5213y;
        switch (i10) {
            case 0:
                kd.h0 it = (kd.h0) obj;
                bf.o[] oVarArr = PlayerActivity.V;
                kotlin.jvm.internal.k.e(it, "it");
                Parcelable[] parcelableArr = playerActivity.d0().f10064d.f5227e;
                if (parcelableArr != null) {
                    list = ie.i.q0(parcelableArr);
                }
                String newSlug = String.valueOf(list.indexOf(it));
                if (!kotlin.jvm.internal.k.a(newSlug, playerActivity.d0().f10064d.f5223a)) {
                    playerActivity.g0();
                    od.c0 d02 = playerActivity.d0();
                    d02.getClass();
                    kotlin.jvm.internal.k.e(newSlug, "newSlug");
                    d02.f10064d = z.a(d02.f10064d, newSlug, 2, 252);
                    d02.j();
                }
                return yVar;
            case 1:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                bf.o[] oVarArr2 = PlayerActivity.V;
                if (intValue != ((Number) playerActivity.d0().f10067g.getValue()).intValue()) {
                    playerActivity.g0();
                    f1 f1Var = playerActivity.d0().f10067g;
                    f1Var.getClass();
                    f1Var.h(null, num);
                }
                return yVar;
            case 2:
                Parcelable it2 = (Parcelable) obj;
                bf.o[] oVarArr3 = PlayerActivity.V;
                kotlin.jvm.internal.k.e(it2, "it");
                if (it2 instanceof kd.l) {
                    String valueOf = String.valueOf(((kd.l) it2).f7876x);
                    if (!kotlin.jvm.internal.k.a(valueOf, playerActivity.d0().f10064d.f5223a)) {
                        playerActivity.g0();
                        playerActivity.d0().k(valueOf);
                    }
                } else if (it2 instanceof kd.u) {
                    String valueOf2 = String.valueOf(((kd.u) it2).f7900x);
                    if (!kotlin.jvm.internal.k.a(valueOf2, playerActivity.d0().f10064d.f5223a)) {
                        playerActivity.g0();
                        playerActivity.d0().k(valueOf2);
                    }
                } else if (it2 instanceof kd.h0) {
                    Parcelable[] parcelableArr2 = playerActivity.d0().f10064d.f5227e;
                    if (parcelableArr2 != null) {
                        list = ie.i.q0(parcelableArr2);
                    }
                    String newSlug2 = String.valueOf(list.indexOf(it2));
                    if (!kotlin.jvm.internal.k.a(newSlug2, playerActivity.d0().f10064d.f5223a)) {
                        playerActivity.g0();
                        od.c0 d03 = playerActivity.d0();
                        d03.getClass();
                        kotlin.jvm.internal.k.e(newSlug2, "newSlug");
                        d03.f10064d = z.a(d03.f10064d, newSlug2, 2, 252);
                        d03.j();
                    }
                }
                return yVar;
            case 3:
                Integer num2 = (Integer) obj;
                bf.o[] oVarArr4 = PlayerActivity.V;
                kotlin.jvm.internal.k.b(num2);
                int intValue2 = num2.intValue();
                if (intValue2 != 1) {
                    if (intValue2 != 2) {
                        playerActivity.Y().j.setResizeMode(0);
                        playerActivity.Z().setImageResource(R.drawable.mode_fill);
                    } else {
                        playerActivity.Y().j.setResizeMode(4);
                        playerActivity.Z().setImageResource(R.drawable.mode_none);
                    }
                } else {
                    playerActivity.Y().j.setResizeMode(3);
                    playerActivity.Z().setImageResource(R.drawable.mode_crop);
                }
                return yVar;
            case 4:
                he.m mVar = playerActivity.J;
                jd.y yVar2 = (jd.y) obj;
                bf.o[] oVarArr5 = PlayerActivity.V;
                kotlin.jvm.internal.k.b(yVar2);
                ErrorLyBinding errorLyBinding = playerActivity.Y().f3157e;
                TextView textView = errorLyBinding.f3260f;
                TextView textView2 = errorLyBinding.f3259e;
                ImageView imageView = errorLyBinding.f3257c;
                LinearLayout linearLayout = errorLyBinding.f3258d;
                CircularProgressIndicator circularProgressIndicator = errorLyBinding.f3261g;
                if (yVar2 instanceof jd.w) {
                    circularProgressIndicator.setVisibility(0);
                    linearLayout.setVisibility(8);
                } else if (yVar2 instanceof jd.v) {
                    circularProgressIndicator.setVisibility(8);
                    linearLayout.setVisibility(0);
                    Throwable th = ((jd.v) yVar2).f7410a;
                    if (!(th instanceof NetConnectException) && !(th instanceof NetworkingException) && !(th instanceof NetUnknownHostException)) {
                        imageView.setImageResource(R.drawable.ic_warning);
                        textView2.setText(R.string.connection_error_title);
                        textView.setText(R.string.connection_error_text);
                    } else {
                        imageView.setImageResource(R.drawable.ic_wifi_error);
                        textView2.setText(R.string.no_internet_title);
                        textView.setText(R.string.no_internet_text);
                    }
                } else if (yVar2 instanceof jd.x) {
                    circularProgressIndicator.setVisibility(8);
                    linearLayout.setVisibility(8);
                    TextView textView3 = errorLyBinding.f3256b;
                    Object obj2 = ((jd.x) yVar2).f7412a;
                    if (obj2 instanceof List) {
                        z10 = ((List) obj2).isEmpty();
                    } else {
                        if (obj2 instanceof he.i) {
                            Object obj3 = ((he.i) obj2).f6077y;
                            if (obj3 instanceof List) {
                                list2 = (List) obj3;
                            }
                            if (list2 != null && list2.isEmpty()) {
                                z10 = true;
                            }
                        }
                        z10 = false;
                    }
                    if (z10) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    textView3.setVisibility(i6);
                    List list3 = (List) obj2;
                    if (!list3.isEmpty()) {
                        RecyclerView recyclerView = playerActivity.Y().f3161i;
                        Parcelable parcelable = (Parcelable) ie.j.G(list3);
                        if (parcelable instanceof kd.l) {
                            PlayerActivity.j0(playerActivity, recyclerView);
                            if (!kotlin.jvm.internal.k.a(recyclerView.getAdapter(), playerActivity.c0())) {
                                recyclerView.setAdapter(playerActivity.c0());
                            }
                            playerActivity.c0().i(list3);
                        } else if (parcelable instanceof kd.h0) {
                            PlayerActivity.j0(playerActivity, recyclerView);
                            if (!kotlin.jvm.internal.k.a(recyclerView.getAdapter(), (gd.s) mVar.getValue())) {
                                recyclerView.setAdapter((gd.s) mVar.getValue());
                            }
                            ((gd.s) mVar.getValue()).i(list3);
                        } else if (parcelable instanceof kd.u) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(1));
                            while (recyclerView.getItemDecorationCount() > 0) {
                                recyclerView.a0();
                            }
                            if (!kotlin.jvm.internal.k.a(recyclerView.getAdapter(), playerActivity.c0())) {
                                recyclerView.setAdapter(playerActivity.c0());
                            }
                            playerActivity.c0().i(list3);
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
                RecyclerView recyclerView2 = playerActivity.Y().f3161i;
                if (yVar2 instanceof jd.x) {
                    i11 = 0;
                }
                recyclerView2.setVisibility(i11);
                return yVar;
            case 5:
                kd.a0 a0Var = (kd.a0) obj;
                q3 q3Var = playerActivity.H;
                if (q3Var != null && (countDownTimer = (CountDownTimer) q3Var.D) != null) {
                    countDownTimer.cancel();
                }
                playerActivity.H = null;
                ActivityPlayerBinding Y = playerActivity.Y();
                LinearLayout linearLayout2 = Y.f3159g;
                if (a0Var != null) {
                    i11 = 0;
                }
                linearLayout2.setVisibility(i11);
                if (a0Var != null) {
                    ImageView imageView2 = Y.f3166o;
                    String str = a0Var.A;
                    l6.f a10 = l6.a.a(imageView2.getContext());
                    v6.i iVar = new v6.i(imageView2.getContext());
                    iVar.f13364c = str;
                    iVar.c(imageView2);
                    cf.m.J(iVar);
                    ((l6.k) a10).b(iVar.a());
                    ImageView imageView3 = Y.f3167p;
                    String str2 = a0Var.B;
                    l6.f a11 = l6.a.a(imageView3.getContext());
                    v6.i iVar2 = new v6.i(imageView3.getContext());
                    iVar2.f13364c = str2;
                    iVar2.c(imageView3);
                    cf.m.J(iVar2);
                    ((l6.k) a11).b(iVar2.a());
                    playerActivity.H = new q3(a0Var, Y.f3165n, Y.f3158f, playerActivity.d0().f10064d.f5226d, null, null);
                }
                return yVar;
            case 6:
                List list4 = (List) obj;
                bf.o[] oVarArr6 = PlayerActivity.V;
                kotlin.jvm.internal.k.b(list4);
                ChipGroup chipGroup = playerActivity.Y().f3163l;
                if (list4.size() >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i11 = 0;
                }
                chipGroup.setVisibility(i11);
                if (z11) {
                    int intValue3 = ((Number) playerActivity.d0().f10067g.getValue()).intValue();
                    ArrayList arrayList = new ArrayList(ie.l.x(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((p0) it3.next()).f7890a);
                    }
                    t tVar = new t(playerActivity, i12);
                    chipGroup.removeAllViews();
                    Context context = chipGroup.getContext();
                    int size = arrayList.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < size) {
                        Object obj4 = arrayList.get(i13);
                        i13++;
                        int i15 = i14 + 1;
                        if (i14 >= 0) {
                            String str3 = (String) obj4;
                            kotlin.jvm.internal.k.b(context);
                            if (intValue3 == i14) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            t tVar2 = tVar;
                            chipGroup.addView(cf.m.d(context, str3, i14, z12, null, tVar2));
                            tVar = tVar2;
                            i14 = i15;
                        } else {
                            ie.k.w();
                            throw null;
                        }
                    }
                    chipGroup.post(new a2.a(playerActivity, 22));
                }
                return yVar;
            default:
                p0 p0Var = (p0) obj;
                bf.o[] oVarArr7 = PlayerActivity.V;
                if (p0Var != null) {
                    playerActivity.f0(p0Var);
                }
                return yVar;
        }
    }
}
