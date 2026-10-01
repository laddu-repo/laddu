package me;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements ce.p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8725v;

    public /* synthetic */ q(int i) {
        this.f8725v = i;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        sd.b bVar;
        switch (this.f8725v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((sd.h) obj).n0((sd.f) obj2);
            case 2:
                return ((sd.h) obj).n0((sd.f) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                sd.f fVar = (sd.f) obj2;
                if (!(fVar instanceof re.v)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fVar : Integer.valueOf(iIntValue + 1);
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                re.v vVar = (re.v) obj;
                sd.f fVar2 = (sd.f) obj2;
                if (vVar != null) {
                    return vVar;
                }
                if (fVar2 instanceof re.v) {
                    return (re.v) fVar2;
                }
                return null;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                re.y yVar = (re.y) obj;
                sd.f fVar3 = (sd.f) obj2;
                if (fVar3 instanceof re.v) {
                    re.v vVar2 = (re.v) fVar3;
                    Object objC = vVar2.c(yVar.f11411a);
                    Object[] objArr = yVar.f11412b;
                    int i = yVar.f11414d;
                    objArr[i] = objC;
                    re.v[] vVarArr = yVar.f11413c;
                    yVar.f11414d = i + 1;
                    vVarArr[i] = vVar2;
                }
                return yVar;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                sd.f fVar4 = (sd.f) obj2;
                de.i.e(str, "acc");
                de.i.e(fVar4, "element");
                if (str.length() == 0) {
                    return fVar4.toString();
                }
                return str + ", " + fVar4;
            default:
                sd.h hVar = (sd.h) obj;
                sd.f fVar5 = (sd.f) obj2;
                de.i.e(hVar, "acc");
                de.i.e(fVar5, "element");
                sd.h hVarL = hVar.l(fVar5.getKey());
                sd.i iVar = sd.i.f11797v;
                if (hVarL == iVar) {
                    return fVar5;
                }
                sd.d dVar = sd.d.f11796v;
                sd.e eVar = (sd.e) hVarL.A(dVar);
                if (eVar == null) {
                    bVar = new sd.b(fVar5, hVarL);
                } else {
                    sd.h hVarL2 = hVarL.l(dVar);
                    if (hVarL2 == iVar) {
                        return new sd.b(eVar, fVar5);
                    }
                    bVar = new sd.b(eVar, new sd.b(fVar5, hVarL2));
                }
                return bVar;
        }
    }
}
