package gc;

import android.content.Intent;
import androidx.media3.decoder.DecoderInputBuffer;
import com.livxow.tv.activities.MainActivity;
import com.livxow.tv.activities.PlayerActivity;
import mc.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements qc.j, hc.n, y {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f5810w;

    public /* synthetic */ i(PlayerActivity playerActivity, int i) {
        this.f5809v = i;
        this.f5810w = playerActivity;
    }

    @Override // hc.n
    public void a(String str, String str2, String str3, String str4, int i, boolean z2) {
        PlayerActivity playerActivity = this.f5810w;
        playerActivity.f3646g0 = str;
        playerActivity.f3647h0 = str2;
        playerActivity.f3648i0 = str3;
        playerActivity.f3659u0 = i;
        playerActivity.f3649j0 = str4;
        playerActivity.f3651l0 = z2;
        playerActivity.z(str, str2, str3, str4, null);
    }

    @Override // mc.y
    public void b() {
        int i = PlayerActivity.J0;
        PlayerActivity playerActivity = this.f5810w;
        playerActivity.startActivity(new Intent(playerActivity, (Class<?>) MainActivity.class));
        playerActivity.finish();
    }

    @Override // qc.j
    public void c(String str, boolean z2) {
        switch (this.f5809v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = PlayerActivity.J0;
                PlayerActivity playerActivity = this.f5810w;
                if (!z2) {
                    playerActivity.z("https://pro.com", "pro", null, null, null);
                } else {
                    playerActivity.C(str, false);
                }
                break;
            case 1:
                int i10 = PlayerActivity.J0;
                PlayerActivity playerActivity2 = this.f5810w;
                if (!z2) {
                    playerActivity2.z("https://pro.com", "pro", null, null, null);
                } else {
                    playerActivity2.C(str, false);
                }
                break;
            default:
                int i11 = PlayerActivity.J0;
                PlayerActivity playerActivity3 = this.f5810w;
                playerActivity3.getClass();
                if (z2) {
                    try {
                        JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
                        playerActivity3.E0 = vc.a.v(playerActivity3, playerActivity3.W, jSONObject);
                        playerActivity3.F0 = jSONObject.optString("app_versions", "5,6");
                    } catch (IndexOutOfBoundsException | JSONException unused) {
                        return;
                    }
                }
                break;
        }
    }
}
