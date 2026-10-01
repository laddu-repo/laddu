package z6;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14814a;

    public u(long j8) {
        this.f14814a = j8;
    }

    public static u a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new u(Long.parseLong(jsonReader.nextString())) : new u(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof u) && this.f14814a == ((u) obj).f14814a;
    }

    public final int hashCode() {
        long j8 = this.f14814a;
        return ((int) (j8 ^ (j8 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return j4.a.m(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f14814a, "}");
    }
}
