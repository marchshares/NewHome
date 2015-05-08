/**
 * Created by VikaTimur on 08.05.2015.
 */
public enum NewHomes {
    NOVOKOSINO_2_K1("http://novokosino2.ndv.ru/sale.htm?build=1465", "Новокосино-2", "Корпус-1" ,"2016-2"),
    NOVOKOSINO_2_K2("http://novokosino2.ndv.ru/sale.htm?build=1538", "Новокосино-2", "Корпус-2" ,"2016-2"),
    NOVOKOSINO_2_K3("http://novokosino2.ndv.ru/sale.htm?build=1603", "Новокосино-2", "Корпус-3" ,"2015-4"),
    NOVOKOSINO_2_K4("http://novokosino2.ndv.ru/sale.htm?build=1590", "Новокосино-2", "Корпус-4" ,"2015-4"),
    NOVOKOSINO_2_K5("http://novokosino2.ndv.ru/sale.htm?build=2040", "Новокосино-2", "Корпус-5" ,"2015-4"),
    NOVOKOSINO_2_K6("http://novokosino2.ndv.ru/sale.htm?build=1493", "Новокосино-2", "Корпус-6" ,"ВК"),
    NOVOKOSINO_2_K7("http://novokosino2.ndv.ru/sale.htm?build=1791", "Новокосино-2", "Корпус-7" ,"ВК"),
    NOVOKOSINO_2_K8("http://novokosino2.ndv.ru/sale.htm?build=1357", "Новокосино-2", "Корпус-8" ,"Собственность"),
    NOVOKOSINO_2_K9("http://novokosino2.ndv.ru/sale.htm?build=1411", "Новокосино-2", "Корпус-9" ,"Собственность"),
    //NOVOKOSINO_2_K10 - нет в наличии
    //NOVOKOSINO_2_K11 - нет в наличии
    NOVOKOSINO_2_K12("http://novokosino2.ndv.ru/sale.htm?build=1606", "Новокосино-2", "Корпус-12" ,"2015-4"),
    NOVOKOSINO_2_K13("http://novokosino2.ndv.ru/sale.htm?build=1605", "Новокосино-2", "Корпус-13" ,"2015-4"),
    //NOVOKOSINO_2_K14 - нет в наличии
    //NOVOKOSINO_2_K15 - нет в наличии
    NOVOKOSINO_2_K16("http://novokosino2.ndv.ru/sale.htm?build=2113", "Новокосино-2", "Корпус-16" ,"2018-2"),
    NOVOKOSINO_2_K17("http://novokosino2.ndv.ru/sale.htm?build=2157", "Новокосино-2", "Корпус-17" ,"неиз");

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
