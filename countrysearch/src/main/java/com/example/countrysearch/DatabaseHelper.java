package com.example.countrysearch;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by j16014 on 2018/01/16 (016).
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    /* データベース名 */
    private final static String DB_NAME = "androidstudydb";
    /* データベースのバージョン */
    private final static int DB_VER = 1;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME,null,DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "";
        sql += "create table MyTable(";
        sql += "No integer primary key";
        sql += ",Name text not null COLLATE nocase";
        sql += ",Ido real";
        sql += ",Keido real";
        sql += ")";
        sqLiteDatabase.execSQL(sql);

        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Republic of Fiji',-18.158147,178.43382);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Papua New Guinea',-9.4283884,147.19202);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Vanuatu',-17.734924,168.32052);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Solomon Islands',-9.433728,159.95581);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Federated States of Micronesia',6.9244164,158.16035);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Marshall Islands',7.1065806,171.37532);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Palau',7.500644,134.62409);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Nauru',-0.53463358,166.91219);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Tonga',-21.131245,-175.2004);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Tuvalu',-8.5243405,179.19468);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Samoa',-13.833182,-171.75893);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Kiribati',1.3500828,173.03897);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('New Zealand',-41.278117,174.77647);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Australia',-35.308236,149.12515);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Lesotho',-29.314174,27.494136);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Mozambique',-25.968565,32.573582);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Republic of South Africa',-29.115852,26.21644);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Malawi',-13.9635,33.841624);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Botswana',-24.658054,25.910649);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Namibia',-22.566624,17.089572);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Tanzania',-6.8156642,39.29853);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Swaziland',-26.332146,31.142394);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Zimbabwe',-17.81201,31.057648);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Zambia',-15.392315,28.309021);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Angola',-8.8141219,13.238392);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Rwanda',-1.9525705,30.098712);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Burundi',-3.3783536,29.357897);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Central African Republic',4.3932096,18.562756);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Chad',12.108572,15.03686);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Republic of Equatorial Guinea',3.757953,8.7894056);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Sao Tome And Principe',0.33146811,6.7409395);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Democratic Republic of the Congo',-4.3324727,15.302908);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Republic of the Congo',-4.279178,15.27812);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Cameroon',3.87363,11.515545);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Gabon',0.41088893,9.4438746);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Mauritius',-20.162762,57.502851);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Madagascar',-19.00314,47.529452);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Soomaaliya',2.0427479,45.35129);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Seychelles',-4.6230962,55.45537);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Sudan',15.617693,32.487688);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Djibouti',11.618841,43.146595);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Comoros',-11.705593,43.250532);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Kenya',-1.2903352,36.820166);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Ertra',15.338296,38.933808);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Ethiopia',9.0145749,38.765865);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Uganda',0.31580999,32.587927);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Liberia',6.3001236,-10.798406);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Mauritania',18.094294,-15.970762);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Mali',12.648731,-7.9935728);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Benin',6.3485402,2.4051622);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Burkina Faso',12.367775,-1.527057);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Niger',13.511217,7.5101973);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Nigeria',9.0681535,7.5101973);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Togo',6.1301861,1.2163389);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Senegal',14.662453,-17.438466);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Sierra Leone',8.4806134,-13.232907);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Cote d'' Ivoire',5.3334605,-4.0208718);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Guinea-Bissau',11.864002,-15.598224);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Guinea',9.533171,-13.684012);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Gambia',13.45568,-16.574392);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Cape Verde',14.923031,-23.520642);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Ghana',5.5575053,-0.19034235);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Libya',32.887894,13.189323);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Morocco',34.017678,-68365344);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Tunisia',36.808327,10.135716);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Egypt',30.040429,31.236906);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Algeria',36.766432,3.055616);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Bolivia',-16.4958,-68.133824);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Peru',-12.045394,-77.030031);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Venezuela',10.508146,-66.919227);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Brazil',-15.799668,-47.864154);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Paraguay',-25.277516,-57.637108);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Chile',-33.443259,-70.653498);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Suriname',5.826856,-55.151306);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Colombia',4.595438,-74.077478);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Guyana',6.808608,-58.166663);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Ecuador',-0.21309688,-78.498624);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Uruguay',-34.891211,-56.187167);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Argentina',-34.60972,-58.392549);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Barbados',13.097303,-59.614069);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Bahamas',25.075629,-77.344382);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Haiti',18.542837,-72.338767);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Trinidad and Tobago',10.674071,-61512821);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Commonwealth of Dominica',15.305951,-61.384505);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Dominican Republic',18.474244,-69.897743);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Saint Lucia',14.005696,-60.997829);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Saint Vincent and the Grenadines',13.154401,-61.22602);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('St.Kitts & Nevis',17.303747,-62.721622);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Jamaica',18.023113,-76.784017);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Grenada',12.052127,-61.752605);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Cuba',23.120826,-82.386791);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Antigua and Barbuda',17.11742,-61.846532);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Mexico',19.42968,-99.117098);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Honduras',14.103746,-87.20482);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Belize',17.250723,-88.766745);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Panama',9.0024187,-79.516482);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Nicaragua',12.153452,-86.273339);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Costa Rica',9.9359502,-84.074196);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Guatemala',14.594553,-90.517755);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('El Salvador',13.701298,-89.224299);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Canada',45.424329,-75.698513);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('States of America',38.897159,-77.036207);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('USA',38.889893,-77.00867);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Lithuania',54.690891,25.261768);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Latvia',56.951197,24.104795);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Estonia',59.435687,24.737451);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Finland',60.172393,24.93369);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Norway',59.916569,10.728791);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Danmark',55.67482,12.580519);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Sweden',59.326605,18.070397);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Iceland',64.146711,-21.940373);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Monaco',43.731313,7.420514);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Malta',35.898631,14.514385);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Portugal',38.712593,-9.1537184);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Vaticano',41.902212,12.453504);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Spain',40.418534,-3.7128307);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('San Marino',43.936669,12.446987);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Greece',37.975161,23.737028);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Italy',41.901214,14.478819);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Hungary',47.507023,19.045591);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Germany',52.518555,13.37462);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Poland',52.225155,21.028134);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Czech',50.089145,14.415107);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Slovensko',48.141839,17.097159);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Switzerland',46.946543,7.4441761);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Austria',48.207965,16.358429);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Russia',55.752781,37.618408);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Romania',44.427606,26.088462);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Montenegro',42.441473,19.256276);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Moldova',47.025072,28.833579);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Macedonia',41.99266,21.432537);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Bosnia and Herzegovina',43.854747,18.406025);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Belarus',53.895818,27.545178);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Bulgaria',42.694604,23.332915);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Srbija',44.806303,20.460235);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Slovenia',46.049238,14.497816);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Croatia',45.809466,15.969883);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Ukrajina',50.447675,30.533687);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Albania',41.327901,19.818667);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Luxembourg',49.60965,6.1313542);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Liechtenstein',4713949,9.5246492);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Belgium',50.841703,4.3624468);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('France',48.870369,2.3166005);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Netherlands',52.373099,4.8915381);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Holland',52.080526,4.3250938);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('The United Kingdom of Great Britain and Northern Ireland',51.499183,-0.12464066);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('UK',51.499183,-0.12464066);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Andorra',42.507141,1.5214467);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Ireland',53.339125,-6.2533736);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Lebanon',33.896013,35.500864);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Jordan',31.956963,35.950337);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Bahrain',26.218469,50.592692);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Turkey',39.91104,32.850721);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Suriyah',33.517268,36.250067);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Saudi Arabia',24.648045,46.686869);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Georgia',41.696607,44.79853);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Kuwait',29.381077,47.972074);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Cyprus',35.155415,33.347361);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Qatar',25.290613,51.527301);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Oman',23.614127,58.592986);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Iraq',33.284167,44.256111);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Israel',32.08177,34.780812);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Yemen',15.312861,44.213492);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Armenia',40.178137,44.513478);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('United Arab Emirates',24.482295,54.35636);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Azerbaijan',40.379535,49.849088);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Turkmenistan',37.932466,58.378421);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Tajikistan',38.57617,68.779032);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Kyrgyzstan',42.877034,74.600147);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Kazakhstan',51.125801,71.4468);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Uzbekistan',41.314319,69.265154);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Iran',35.699555,51.337861);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Afghanistan',34.52865,69.174832);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Maldives',4.1786849,73.512716);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Bhutan',27.489478,89.634667);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Bangladesh',23.762287,90.378836);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Pakistan',33.730194,73.097159);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Nepal',27.704529,85.307401);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Sri Lanka',6.9104071,79.888872);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('India',28.614387,77.19934);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Laos',17.976451,102.6346);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Myanmar',19.738713,96.207692);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Malaysia',3.1328934,101.696);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Vietnam',21.039311,105.83415);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Brunei',4.8892,114.9393);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Philippines',14.582461,120.97905);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('East Timor',-8.5540817,125.57871);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Thailand',13.771899,100.51267);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Singapore',1.2891639,103.8505);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Kampuchea',11.563382,104.93104);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Indonesia',-6.2105556,106.80009);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Taiwan',25.039868,121.511879);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('China',39.908222,116.391027);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Mongol',47.920728,106.91741);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('North Korea',39.031965,125.75359);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('South Korea',37.531084,126.91583);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Japan',35.67581,139.74507);");
        sqLiteDatabase.execSQL("INSERT INTO MyTable(Name,Ido,Keido) values ('Takeuchi',34.994336,138.419006);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
