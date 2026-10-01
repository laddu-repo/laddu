package qc;

import java.io.IOException;
import java.net.ServerSocket;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends md.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile k f10982g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10983e;
    public String f;

    public k(String str) throws IOException {
        this.f8674c = new e3.c(7);
        this.f = str;
        this.f10983e = j4.a.n(new StringBuilder("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Ad</title>\n    <style>\n        body {\n            display: flex;\n            justify-content: center;\n            align-items: center;\n            height: 100vh;\n            margin: 0;\n            background: transparent;\n        }\n    </style>\n</head>\n<body>\n"), this.f, "</body>\n</html>");
        this.f8672a = new ServerSocket();
        this.f8672a.setReuseAddress(true);
        md.j jVar = new md.j(this);
        Thread thread = new Thread(jVar);
        this.f8673b = thread;
        thread.setDaemon(false);
        this.f8673b.setName("NanoHttpd Main Listener");
        this.f8673b.start();
        while (!jVar.f8669w && jVar.f8668v == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = jVar.f8668v;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final md.h e() {
        return md.k.c(md.g.f8657x, "text/html", this.f10983e);
    }
}
