package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.ea;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.i9;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.o9;
import com.google.android.gms.internal.measurement.p9;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca f7826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f7827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f7828e;
    public final v.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v.e f7829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f7830h;

    public w4(c cVar, String str, ca caVar, BitSet bitSet, BitSet bitSet2, v.e eVar, v.e eVar2) {
        this.f7830h = cVar;
        this.f7824a = str;
        this.f7827d = bitSet;
        this.f7828e = bitSet2;
        this.f = eVar;
        this.f7829g = new v.e(0);
        for (Integer num : (v.b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f7829g.put(num, arrayList);
        }
        this.f7825b = false;
        this.f7826c = caVar;
    }

    public final void a(b bVar) {
        int iV;
        boolean z2;
        boolean zA;
        switch (bVar.f7389g) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                iV = ((f8) bVar.i).v();
                break;
            default:
                iV = ((l8) bVar.i).v();
                break;
        }
        if (bVar.f7386c != null) {
            this.f7828e.set(iV, true);
        }
        Boolean bool = bVar.f7387d;
        if (bool != null) {
            this.f7827d.set(iV, bool.booleanValue());
        }
        if (bVar.f7388e != null) {
            Integer numValueOf = Integer.valueOf(iV);
            v.e eVar = this.f;
            Long l10 = (Long) eVar.get(numValueOf);
            long jLongValue = bVar.f7388e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f != null) {
            Integer numValueOf2 = Integer.valueOf(iV);
            v.e eVar2 = this.f7829g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            switch (bVar.f7389g) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                    z2 = false;
                    break;
                default:
                    z2 = true;
                    break;
            }
            if (z2) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.a4.a();
            p1 p1Var = (p1) this.f7830h.f2053w;
            g gVar = p1Var.f7695y;
            e0 e0Var = f0.G0;
            String str = this.f7824a;
            if (gVar.O(str, e0Var)) {
                switch (bVar.f7389g) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        zA = ((f8) bVar.i).A();
                        break;
                    default:
                        zA = false;
                        break;
                }
                if (zA) {
                    arrayList.clear();
                }
            }
            com.google.android.gms.internal.measurement.a4.a();
            if (!p1Var.f7695y.O(str, e0Var)) {
                arrayList.add(Long.valueOf(bVar.f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(bVar.f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final j9 b(int i) {
        ArrayList arrayList;
        List list;
        i9 i9VarB = j9.B();
        i9VarB.b();
        ((j9) i9VarB.f2653w).C(i);
        i9VarB.b();
        ((j9) i9VarB.f2653w).F(this.f7825b);
        ca caVar = this.f7826c;
        if (caVar != null) {
            i9VarB.b();
            ((j9) i9VarB.f2653w).E(caVar);
        }
        ba baVarC = ca.C();
        ArrayList arrayListJ0 = p4.j0(this.f7827d);
        baVarC.b();
        ((ca) baVarC.f2653w).G(arrayListJ0);
        ArrayList arrayListJ02 = p4.j0(this.f7828e);
        baVarC.b();
        ((ca) baVarC.f2653w).E(arrayListJ02);
        v.e eVar = this.f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f13021x);
            for (Integer num : (v.b) eVar.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) eVar.get(num);
                if (l10 != null) {
                    o9 o9VarY = p9.y();
                    o9VarY.b();
                    ((p9) o9VarY.f2653w).z(iIntValue);
                    long jLongValue = l10.longValue();
                    o9VarY.b();
                    ((p9) o9VarY.f2653w).A(jLongValue);
                    arrayList2.add((p9) o9VarY.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            baVarC.b();
            ((ca) baVarC.f2653w).I(arrayList);
        }
        v.e eVar2 = this.f7829g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f13021x);
            for (Integer num2 : (v.b) eVar2.keySet()) {
                da daVarZ = ea.z();
                int iIntValue2 = num2.intValue();
                daVarZ.b();
                ((ea) daVarZ.f2653w).A(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    daVarZ.b();
                    ((ea) daVarZ.f2653w).B(list2);
                }
                arrayList3.add((ea) daVarZ.e());
            }
            list = arrayList3;
        }
        baVarC.b();
        ((ca) baVarC.f2653w).K(list);
        i9VarB.b();
        ((j9) i9VarB.f2653w).D((ca) baVarC.e());
        return (j9) i9VarB.e();
    }

    public w4(c cVar, String str) {
        this.f7830h = cVar;
        this.f7824a = str;
        this.f7825b = true;
        this.f7827d = new BitSet();
        this.f7828e = new BitSet();
        this.f = new v.e(0);
        this.f7829g = new v.e(0);
    }
}
