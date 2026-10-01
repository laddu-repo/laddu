package dc;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import me.v;
import me.x;
import org.json.JSONObject;
import p4.b0;
import p4.u;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ud.h implements ce.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ ud.h E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f4476z = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, LinkedHashMap linkedHashMap, ac.o oVar, d1.o oVar2, sd.c cVar) {
        super(2, cVar);
        this.B = eVar;
        this.C = linkedHashMap;
        this.D = oVar;
        this.E = oVar2;
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        v vVar = (v) obj;
        sd.c cVar = (sd.c) obj2;
        switch (this.f4476z) {
        }
        return ((d) l(vVar, cVar)).o(od.l.f10126a);
    }

    @Override // ud.a
    public final sd.c l(Object obj, sd.c cVar) {
        switch (this.f4476z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new d((e) this.B, (LinkedHashMap) this.C, (ac.o) this.D, (d1.o) this.E, cVar);
            default:
                d dVar = new d((u) this.C, (me.h) this.D, (ac.o) this.E, cVar);
                dVar.B = obj;
                return dVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ud.a
    public final Object o(Object obj) throws Throwable {
        sd.c cVar;
        switch (this.f4476z) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d1.o oVar = (d1.o) this.E;
                int i = this.A;
                od.l lVar = od.l.f10126a;
                td.a aVar = td.a.f12544v;
                try {
                } catch (Exception e7) {
                    String message = e7.getMessage();
                    if (message == null) {
                        message = e7.toString();
                    }
                    this.A = 3;
                    oVar.i(message, this);
                    if (lVar != aVar) {
                        return lVar;
                    }
                }
                if (i != 0) {
                    if (i == 1 || i == 2) {
                        fa.b.z(obj);
                        return lVar;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fa.b.z(obj);
                    return lVar;
                }
                fa.b.z(obj);
                URLConnection uRLConnectionOpenConnection = e.a((e) this.B).openConnection();
                de.i.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : ((LinkedHashMap) this.C).entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb2.append(line);
                        } else {
                            bufferedReader.close();
                            inputStream.close();
                            JSONObject jSONObject = new JSONObject(sb2.toString());
                            ac.o oVar2 = (ac.o) this.D;
                            this.A = 1;
                            if (oVar2.i(jSONObject, this) != aVar) {
                                return lVar;
                            }
                        }
                    }
                } else {
                    this.A = 2;
                    oVar.i("Bad response code: " + responseCode, this);
                    if (lVar != aVar) {
                        return lVar;
                    }
                }
                return aVar;
            default:
                int i10 = this.A;
                if (i10 == 0) {
                    fa.b.z(obj);
                    sd.f fVarA = ((v) this.B).b().A(sd.d.f11796v);
                    de.i.b(fVarA);
                    sd.e eVar = (sd.e) fVarA;
                    u uVar = (u) this.C;
                    sd.h hVarG = com.bumptech.glide.d.G((sd.a) eVar, new b0(eVar));
                    sd.h hVarN0 = hVarG.n0(new re.v(hVarG, uVar.f10361h));
                    cVar = (me.h) this.D;
                    ac.o oVar3 = (ac.o) this.E;
                    this.B = cVar;
                    this.A = 1;
                    obj = x.s(hVarN0, oVar3, this);
                    td.a aVar2 = td.a.f12544v;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (sd.c) this.B;
                    fa.b.z(obj);
                }
                cVar.g(obj);
                return od.l.f10126a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u uVar, me.h hVar, ac.o oVar, sd.c cVar) {
        super(2, cVar);
        this.C = uVar;
        this.D = hVar;
        this.E = oVar;
    }
}
