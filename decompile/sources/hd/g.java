package hd;

import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.db.MyDB_Impl;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends e1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MyDB_Impl f6059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MyDB_Impl myDB_Impl) {
        super(1, "821350a6dfa6f62369af6e16f3f2cfcc", "32470f2e2c2b267ebdedbc8c49c38a85");
        this.f6059d = myDB_Impl;
    }

    @Override // e1.g
    public final void a(g5.a connection) {
        k.e(connection, "connection");
        a8.d.d(connection, "CREATE TABLE IF NOT EXISTS `favorites` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `image` TEXT NOT NULL, `formats` TEXT NOT NULL, PRIMARY KEY(`id`))");
        a8.d.d(connection, "CREATE TABLE IF NOT EXISTS `playlistFav` (`name` TEXT, `groupTitle` TEXT, `logo` TEXT, `link` TEXT NOT NULL, `userAgent` TEXT, `referrer` TEXT, `origin` TEXT, `cookie` TEXT, `drmLicense` TEXT, `drmScheme` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        a8.d.d(connection, "CREATE TABLE IF NOT EXISTS `playlists` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `title` TEXT NOT NULL, `path` TEXT NOT NULL)");
        a8.d.d(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        a8.d.d(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '821350a6dfa6f62369af6e16f3f2cfcc')");
    }

    @Override // e1.g
    public final void c(g5.a connection) {
        k.e(connection, "connection");
        a8.d.d(connection, "DROP TABLE IF EXISTS `favorites`");
        a8.d.d(connection, "DROP TABLE IF EXISTS `playlistFav`");
        a8.d.d(connection, "DROP TABLE IF EXISTS `playlists`");
    }

    @Override // e1.g
    public final void r(g5.a connection) {
        k.e(connection, "connection");
    }

    @Override // e1.g
    public final void s(g5.a connection) {
        k.e(connection, "connection");
        this.f6059d.p(connection);
    }

    @Override // e1.g
    public final void t(g5.a connection) {
        k.e(connection, "connection");
    }

    @Override // e1.g
    public final void u(g5.a connection) {
        k.e(connection, "connection");
        j5.f(connection);
    }

    @Override // e1.g
    public final r8.a v(g5.a connection) {
        k.e(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new d5.e(1, 1, "id", "INTEGER", null, true));
        linkedHashMap.put("title", new d5.e(0, 1, "title", "TEXT", null, true));
        linkedHashMap.put("image", new d5.e(0, 1, "image", "TEXT", null, true));
        linkedHashMap.put("formats", new d5.e(0, 1, "formats", "TEXT", null, true));
        d5.h hVar = new d5.h("favorites", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        d5.h p10 = lg.c.p(connection, "favorites");
        if (!hVar.equals(p10)) {
            return new r8.a(false, "favorites(com.playfy.tv.models.Channel).\n Expected:\n" + hVar + "\n Found:\n" + p10, 2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(MediationMetaData.KEY_NAME, new d5.e(0, 1, MediationMetaData.KEY_NAME, "TEXT", null, false));
        linkedHashMap2.put("groupTitle", new d5.e(0, 1, "groupTitle", "TEXT", null, false));
        linkedHashMap2.put("logo", new d5.e(0, 1, "logo", "TEXT", null, false));
        linkedHashMap2.put("link", new d5.e(0, 1, "link", "TEXT", null, true));
        linkedHashMap2.put("userAgent", new d5.e(0, 1, "userAgent", "TEXT", null, false));
        linkedHashMap2.put("referrer", new d5.e(0, 1, "referrer", "TEXT", null, false));
        linkedHashMap2.put("origin", new d5.e(0, 1, "origin", "TEXT", null, false));
        linkedHashMap2.put("cookie", new d5.e(0, 1, "cookie", "TEXT", null, false));
        linkedHashMap2.put("drmLicense", new d5.e(0, 1, "drmLicense", "TEXT", null, false));
        linkedHashMap2.put("drmScheme", new d5.e(0, 1, "drmScheme", "TEXT", null, false));
        linkedHashMap2.put("id", new d5.e(1, 1, "id", "INTEGER", null, false));
        d5.h hVar2 = new d5.h("playlistFav", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        d5.h p11 = lg.c.p(connection, "playlistFav");
        if (!hVar2.equals(p11)) {
            return new r8.a(false, "playlistFav(com.playfy.tv.models.PlaylistItem).\n Expected:\n" + hVar2 + "\n Found:\n" + p11, 2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new d5.e(1, 1, "id", "INTEGER", null, false));
        linkedHashMap3.put("title", new d5.e(0, 1, "title", "TEXT", null, true));
        linkedHashMap3.put("path", new d5.e(0, 1, "path", "TEXT", null, true));
        d5.h hVar3 = new d5.h("playlists", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        d5.h p12 = lg.c.p(connection, "playlists");
        if (!hVar3.equals(p12)) {
            return new r8.a(false, "playlists(com.playfy.tv.models.M3UPlaylist).\n Expected:\n" + hVar3 + "\n Found:\n" + p12, 2);
        }
        return new r8.a(true, (String) null, 2);
    }
}
