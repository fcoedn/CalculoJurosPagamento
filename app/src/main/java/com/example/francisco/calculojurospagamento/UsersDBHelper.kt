package com.example.francisco.calculojurospagamento

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteConstraintException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.Cursor
import android.database.sqlite.SQLiteException

import java.util.ArrayList

class UsersDBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170101',      9.465485330)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170102',      9.473624313)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170103',      9.481770294)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170104',      9.489923280)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170105',      9.498083276)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170106',      9.506250288)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170107',      9.514424323)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170108',      9.522605386)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170109',      9.530793484)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170110',      9.538988623)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170111',      9.547190808)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170112',      9.555400046)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170113',      9.563616343)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170114',      9.571839705)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170115',      9.580070138)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170116',      9.588307648)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170117',      9.596552241)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170118',      9.604803923)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170119',      9.613062700)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170120',      9.621328578)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170121',      9.629601564)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170122',      9.637881664)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170123',      9.646168883)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170124',      9.654463228)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170125',      9.662764705)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170126',      9.671073320)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170127',      9.679389079)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170128',      9.687711989)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170129',      9.696042055)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170130',      9.704379284)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170131',      9.712723682)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170201',      9.721075255)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170202',      9.729434009)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170203',      9.737799950)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170204',      9.746173085)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170205',      9.754553420)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170206',      9.762940961)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170207',      9.771335714)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170208',      9.779737685)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170209',      9.788146880)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170210',      9.796563306)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170211',      9.804986969)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170212',      9.813417875)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170213',      9.821856031)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170214',      9.830301442)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170215',      9.838754115)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170216',      9.847214056)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170217',      9.855681272)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170218',      9.864155768)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170219',      9.872637551)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170220',      9.881126627)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170221',      9.889623003)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170222',      9.898126684)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170223',      9.906637677)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170224',      9.915155989)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170225',      9.923681625)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170226',      9.932214592)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170227',      9.940754896)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170228',      9.949302544)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170229',      9.957857541)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170230',      9.966419894)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170231',      9.974989610)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170301',      9.957725544)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170302',      9.966155675)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170303',      9.974592943)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170304',      9.983037354)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170305',      9.991488914)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170306',      9.999947629)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170307',     10.008413505)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170308',     10.016886548)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170309',     10.025366764)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170310',     10.033854159)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170311',     10.042348740)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170312',     10.050850512)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170313',     10.059359482)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170314',     10.067875655)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170315',     10.076399038)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170316',     10.084929637)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170317',     10.093467458)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170318',     10.102012507)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170319',     10.110564790)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170320',     10.119124313)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170321',     10.127691083)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170322',     10.136265105)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170323',     10.144846386)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170324',     10.153434932)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170325',     10.162030749)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170326',     10.170633843)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170327',     10.179244220)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170328',     10.187861887)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170329',     10.196486849)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170330',     10.205119113)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170331',     10.213758685)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170401',     10.222032636)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170402',     10.230313290)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170403',     10.238600652)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170404',     10.246894727)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170405',     10.255195521)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170406',     10.263503040)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170407',     10.271817288)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170408',     10.280138271)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170409',     10.288465995)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170410',     10.296800465)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170411',     10.305141687)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170412',     10.313489666)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170413',     10.321844407)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170414',     10.330205916)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170415',     10.338574199)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170416',     10.346949261)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170417',     10.355331107)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170418',     10.363719743)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170419',     10.372115175)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170420',     10.380517408)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170421',     10.388926447)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170422',     10.397342298)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170423',     10.405764967)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170424',     10.414194459)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170425',     10.422630779)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170426',     10.431073933)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170427',     10.439523927)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170428',     10.447980766)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170429',     10.456444456)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170430',     10.464915002)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170431',     10.473392410)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170501',     10.473253363)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170502',     10.481598367)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170503',     10.489950021)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170504',     10.498308329)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170505',     10.506673297)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170506',     10.515044930)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170507',     10.523423234)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170508',     10.531808213)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170509',     10.540199874)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170510',     10.548598221)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170511',     10.557003260)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170512',     10.565414996)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170513',     10.573833434)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170514',     10.582258580)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170515',     10.590690439)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170516',     10.599129016)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170517',     10.607574317)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170518',     10.616026347)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170519',     10.624485112)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170520',     10.632950617)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170521',     10.641422867)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170522',     10.649901868)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170523',     10.658387625)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170524',     10.666880143)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170525',     10.675379428)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170526',     10.683885485)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170527',     10.692398319)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170528',     10.700917936)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170529',     10.709444342)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170530',     10.717977542)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170531',     10.726517541)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170601',     10.734600766)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170602',     10.742690082)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170603',     10.750785494)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170604',     10.758887006)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170605',     10.766994624)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170606',     10.775108351)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170607',     10.783228193)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170608',     10.791354153)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170609',     10.799486237)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170610',     10.807624449)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170611',     10.815768794)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170612',     10.823919276)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170613',     10.832075900)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170614',     10.840238671)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170615',     10.848407593)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170616',     10.856582671)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170617',     10.864763909)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170618',     10.872951313)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170619',     10.881144886)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170620',     10.889344634)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170621',     10.897550561)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170622',     10.905762672)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170623',     10.913980971)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170624',     10.922205463)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170625',     10.930436153)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170626',     10.938673045)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170627',     10.946916145)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170628',     10.955165456)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170629',     10.963420984)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170630',     10.971682733)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170631',     10.979950708)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170701',     10.979402848)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170702',     10.987128395)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170703',     10.994859378)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170704',     11.002595801)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170705',     11.010337668)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170706',     11.018084982)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170707',     11.025837747)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170708',     11.033595967)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170709',     11.041359646)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170710',     11.049128788)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170711',     11.056903397)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170712',     11.064683477)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170713',     11.072469031)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170714',     11.080260063)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170715',     11.088056577)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170716',     11.095858577)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170717',     11.103666067)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170718',     11.111479051)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170719',     11.119297532)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170720',     11.127121515)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170721',     11.134951003)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170722',     11.142786000)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170723',     11.150626510)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170724',     11.158472537)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170725',     11.166324085)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170726',     11.174181157)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170727',     11.182043758)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170728',     11.189911891)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170729',     11.197785561)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170730',     11.205664771)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170731',     11.213549525)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170801',     11.221215623)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170802',     11.228886962)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170803',     11.236563546)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170804',     11.244245378)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170805',     11.251932461)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170806',     11.259624800)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170807',     11.267322397)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170808',     11.275025257)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170809',     11.282733383)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170810',     11.290446779)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170811',     11.298165448)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170812',     11.305889394)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170813',     11.313618620)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170814',     11.321353130)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170815',     11.329092928)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170816',     11.336838017)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170817',     11.344588401)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170818',     11.352344083)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170819',     11.360105068)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170820',     11.367871358)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170821',     11.375642958)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170822',     11.383419871)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170823',     11.391202100)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170824',     11.398989650)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170825',     11.406782524)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170826',     11.414580725)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170827',     11.422384257)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170828',     11.430193124)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170829',     11.438007330)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170830',     11.445826878)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170831',     11.453651772)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170901',     11.461749172)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170902',     11.469852296)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170903',     11.477961149)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170904',     11.486075735)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170905',     11.494196057)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170906',     11.502322120)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170907',     11.510453928)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170908',     11.518591485)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170909',     11.526734795)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170910',     11.534883862)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170911',     11.543038690)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170912',     11.551199284)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170913',     11.559365647)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170914',     11.567537783)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170915',     11.575715697)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170916',     11.583899392)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170917',     11.592088873)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170918',     11.600284144)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170919',     11.608485208)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170920',     11.616692070)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170921',     11.624904734)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170922',     11.633123205)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170923',     11.641347486)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170924',     11.649577581)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170925',     11.657813495)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170926',     11.666055231)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170927',     11.674302794)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170928',     11.682556188)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170929',     11.690815416)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170930',     11.699080483)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220170931',     11.707351394)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171001',     11.707351394)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171002',     11.715628152)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171003',     11.723910761)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171004',     11.732199226)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171005',     11.740493551)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171006',     11.748793739)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171007',     11.757099795)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171008',     11.765411724)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171009',     11.773729529)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171010',     11.782053214)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171011',     11.790382784)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171012',     11.798718243)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171013',     11.807059595)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171014',     11.815406844)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171015',     11.823759994)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171016',     11.832119049)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171017',     11.840484014)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171018',     11.848854893)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171019',     11.857231690)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171020',     11.865614409)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171021',     11.874003054)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171022',     11.882397630)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171023',     11.890798141)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171024',     11.899204590)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171025',     11.907616983)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171026',     11.916035323)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171027',     11.924459614)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171028',     11.932889861)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171029',     11.941326068)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171030',     11.949768239)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171031',     11.958216379)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171101',     11.966590826)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171102',     11.974971137)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171103',     11.983357317)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171104',     11.991749370)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171105',     12.000147300)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171106',     12.008551111)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171107',     12.016960807)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171108',     12.025376393)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171109',     12.033797872)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171110',     12.042225249)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171111',     12.050658528)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171112',     12.059097713)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171113',     12.067542808)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171114',     12.075993817)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171115',     12.084450744)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171116',     12.092913594)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171117',     12.101382370)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171118',     12.109857077)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171119',     12.118337719)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171120',     12.126824300)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171121',     12.135316824)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171122',     12.143815296)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171123',     12.152319719)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171124',     12.160830098)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171125',     12.169346437)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171126',     12.177868740)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171127',     12.186397011)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171128',     12.194931255)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171129',     12.203471475)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171130',     12.212017676)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171131',     12.220569862)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171201',     12.220569862)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171202',     12.229128037)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171203',     12.237692205)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171204',     12.246262371)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171205',     12.254838539)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171206',     12.263420713)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171207',     12.272008897)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171208',     12.280603095)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171209',     12.289203312)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171210',     12.297809552)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171211',     12.306421819)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171212',     12.315040117)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171213',     12.323664450)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171214',     12.332294823)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171215',     12.340931240)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171216',     12.349573705)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171217',     12.358222223)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171218',     12.366876797)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171219',     12.375537432)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171220',     12.384204132)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171221',     12.392876902)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171222',     12.401555745)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171223',     12.410240666)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171224',     12.418931669)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171225',     12.427628759)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171226',     12.436331939)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171227',     12.445041214)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171228',     12.453756588)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171229',     12.462478066)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171230',     12.471205652)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220171231',     12.479939350)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180101',     12.488471211)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180102',     12.497008904)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180103',     12.505552434)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180104',     12.514101805)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180105',     12.522657021)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180106',     12.531218085)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180107',     12.539785002)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180108',     12.548357776)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180109',     12.556936411)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180110',     12.565520910)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180111',     12.574111278)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180112',     12.582707519)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180113',     12.591309637)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180114',     12.599917635)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180115',     12.608531518)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180116',     12.617151290)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180117',     12.625776955)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180118',     12.634408517)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180119',     12.643045980)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180120',     12.651689348)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180121',     12.660338625)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180122',     12.668993815)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180123',     12.677654922)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180124',     12.686321950)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180125',     12.694994903)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180126',     12.703673785)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180127',     12.712358601)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180128',     12.721049354)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180129',     12.729746049)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180130',     12.738448689)")
        db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180131',     12.747157278)")


        //  db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180101', 12.488471211)")
      //  db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180122', 12.668993815)")
      //  db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180123', 12.677654922)")
      //  db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180124',12.686321950)")
     //   db.execSQL("INSERT INTO JURATRASO (cd_chave,vl_taxa) VALUES ('GP220180125', 12.694994903)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
      //   This database is only a cache for online data, so its upgrade policy is
      //   to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES)
         onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }

    /*
    @Throws(SQLiteConstraintException::class)
    fun insertUser(user: UserModel): Boolean {
        // Gets the data repository in write mode
        val db = writableDatabase

        // Create a new map of values, where column names are the keys
        val values = ContentValues()
        values.put(DBContract.UserTabela.COLUMN_CODIGO, user.codigo)
        values.put(DBContract.UserTabela.COLUMN_NOME, user.nome)
        //values.put(DBContract.UserEntry.COLUMN_AGE, user.age)

        // Insert the new row, returning the primary key value of the new row
        val newRowId = db.insert(DBContract.UserTabela.TABLE_NAME, null, values)

        return true
    }

    @Throws(SQLiteConstraintException::class)
    fun deleteUser(codigo: String): Boolean {
        // Gets the data repository in write mode
        val db = writableDatabase
        // Define 'where' part of query.
        val selection = DBContract.UserTabela.COLUMN_CODIGO + " LIKE ?"
        // Specify arguments in placeholder order.
        val selectionArgs = arrayOf(codigo)
        // Issue SQL statement.
        db.delete(DBContract.UserTabela.TABLE_NAME, selection, selectionArgs)

        return true
    }

*/


    fun readUser(cd_chave: String): ArrayList<UserModel> {
        val users = ArrayList<UserModel>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + DBContract.UserTabela.TABLE_NAME + " WHERE " + DBContract.UserTabela.COLUMN_CHAVE + "='" + cd_chave + "'", null)
        } catch (e: SQLiteException) {
            // if table not yet present, create it
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }

        //var codigo: String
        var vl_taxa: Double
        //var age: String
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
            //--    vl_taxa = cursor.getString(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
                vl_taxa = cursor.getDouble(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
          //      age = cursor.getString(cursor.getColumnIndex(DBContract.UserEntry.COLUMN_AGE))

                users.add(UserModel(cd_chave, vl_taxa))
                cursor.moveToNext()
            }
        }
        return users
    }

    fun readUser1(cd_chave: String): Double {
        val vl_taxa:  Double
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + DBContract.UserTabela.TABLE_NAME + " WHERE " + DBContract.UserTabela.COLUMN_CHAVE + "='" + cd_chave + "'", null)
        } catch (e: SQLiteException) {
            // if table not yet present, create it
            db.execSQL(SQL_CREATE_ENTRIES)
            return Double.MIN_VALUE
        }
        //vl_taxa = 5.0
        //var codigo: String
        var vl_taxa1: Double = 0.0
        //var age: String
        //vl_taxa = cursor.getDouble(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                //--    vl_taxa = cursor.getString(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
                vl_taxa1 = cursor.getDouble(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_TAXA))
                //      age = cursor.getString(cursor.getColumnIndex(DBContract.UserEntry.COLUMN_AGE))

              //  users.add(UserModel(cd_chave, vl_taxa))
                cursor.moveToNext()
            }
        }
        vl_taxa = vl_taxa1
        return vl_taxa
    }

    /*
    fun readAllUsers(): ArrayList<UserModel> {
        val users = ArrayList<UserModel>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + DBContract.UserTabela.TABLE_NAME, null)
        } catch (e: SQLiteException) {
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }

        var codigo: String
        var nome: String
        //var age: String
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                codigo = cursor.getString(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_CODIGO))
                nome = cursor.getString(cursor.getColumnIndex(DBContract.UserTabela.COLUMN_NOME))
          //      age = cursor.getString(cursor.getColumnIndex(DBContract.UserEntry.COLUMN_AGE))

                users.add(UserModel(codigo, nome))
                cursor.moveToNext()
            }
        }
        return users
    }

*/
    companion object {
        // If you change the database schema, you must increment the database version.
        val DATABASE_VERSION = 9
        val DATABASE_NAME = "CLAUDINO.db"

        private val SQL_CREATE_ENTRIES =
                "CREATE TABLE " + DBContract.UserTabela.TABLE_NAME + " (" +
                        DBContract.UserTabela.COLUMN_CHAVE + " TEXT PRIMARY KEY," +
                        DBContract.UserTabela.COLUMN_TAXA + " DECIMAL(15,9))"
                        //DBContract.UserTabela.COLUMN_AGE + " TEXT)"

        private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + DBContract.UserTabela.TABLE_NAME
    }

}