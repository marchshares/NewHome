/**
 * Created by VikaTimur on 08.05.2015.
 */
public enum NewHomes {
    NOVOKOSINO_2_K1("http://novokosino2.ndv.ru/sale.htm?build=1465", "����������-2", "������-1" ,"2016-2"),
    NOVOKOSINO_2_K2("http://novokosino2.ndv.ru/sale.htm?build=1538", "����������-2", "������-2" ,"2016-2"),
    NOVOKOSINO_2_K3("http://novokosino2.ndv.ru/sale.htm?build=1603", "����������-2", "������-3" ,"2015-4"),
    NOVOKOSINO_2_K4("http://novokosino2.ndv.ru/sale.htm?build=1590", "����������-2", "������-4" ,"2015-4"),
    NOVOKOSINO_2_K5("http://novokosino2.ndv.ru/sale.htm?build=2040", "����������-2", "������-5" ,"2015-4"),
    NOVOKOSINO_2_K6("http://novokosino2.ndv.ru/sale.htm?build=1493", "����������-2", "������-6" ,"��"),
    NOVOKOSINO_2_K7("http://novokosino2.ndv.ru/sale.htm?build=1791", "����������-2", "������-7" ,"��"),
    NOVOKOSINO_2_K8("http://novokosino2.ndv.ru/sale.htm?build=1357", "����������-2", "������-8" ,"�������������"),
    NOVOKOSINO_2_K9("http://novokosino2.ndv.ru/sale.htm?build=1411", "����������-2", "������-9" ,"�������������"),
    //NOVOKOSINO_2_K10 - ��� � �������
    //NOVOKOSINO_2_K11 - ��� � �������
    NOVOKOSINO_2_K12("http://novokosino2.ndv.ru/sale.htm?build=1606", "����������-2", "������-12" ,"2015-4"),
    NOVOKOSINO_2_K13("http://novokosino2.ndv.ru/sale.htm?build=1605", "����������-2", "������-13" ,"2015-4"),
    //NOVOKOSINO_2_K14 - ��� � �������
    //NOVOKOSINO_2_K15 - ��� � �������
    NOVOKOSINO_2_K16("http://novokosino2.ndv.ru/sale.htm?build=2113", "����������-2", "������-16" ,"2018-2"),
    NOVOKOSINO_2_K17("http://novokosino2.ndv.ru/sale.htm?build=2157", "����������-2", "������-17" ,"����");

    public String id;
    public String url;
    public String name;
    public String corps;
    public String gk;

    NewHomes(String url, String name, String corps, String gk) {
        this.id = name + "_" + corps;

        this.url = url;
        this.name = name;
        this.corps = corps;
        this.gk = gk;
    }
}
