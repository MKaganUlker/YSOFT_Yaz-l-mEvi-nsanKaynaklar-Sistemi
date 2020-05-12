# YSOFT_YazilimEviInsanKaynaklariSistemi
 
### YILDIZ TEKNİK ÜNİVERSİTESİ

### ELEKTRİK - ELEKTRONİK FAKÜLTESİ

### BİLGİSAYAR MÜHENDİSLİĞİ

Sezin BİNER 17011029

Selin GEZER 16011064

Kerem YOLCU 16011067

M. Kağan ÜLKER 15011040


# 1. Proje Planı

## 1.1 Proje Alan Tanımı

YSOFT Yazılım Evi alanında tanınmış bir yazılım şirketidir. Şirket içerisinde
yürütülen projelerin ve çalışanların yönetimi insan kaynakları bölümü
kontrolündedir. Proje ve çalışanların bilgilerinin manuel hazırlanıp dosyalarla
saklanması, planlamaların elle yapılması zaman ve iş gücü kaybına neden
olmaktadır. Bu işlemleri bilgisayar ortamında yapabilmek, çalışan ve proje
hareketliliğini takip etmek ve karışıklığı ortadan kaldırmak üzere bir bilgi
sistemine ihtiyaç duyulmaktadır.

Bu ihtiyaçlar karşılanmak üzere İnsan Kaynakları Bilgi Sistemi tasarlanmıştır.
Sistem herhangi bir durumda yöneticiye karar vermesi için doğru ve gerekli
bilgiyi sağlamayı, insan kaynakları bölümündeki iş yükünü azaltarak verimli
çalışmayı arttırmayı, şirket içi planlama yapmak üzere ihtiyaç duyulan bilgiye
zamanında ulaşmayı amaçlamaktadır.

Sistem şirkette gerçekleştirilen projelerin içerikleri ve gereksinimlerini,
çalışanların kişisel bilgileri ve maaş bilgilerini saklamaktadır. Çalışanlar
bölüm bilgilerine göre ihtiyaç duyulan projeye atanmaktadır. Proje
sonlandığında çalışanlara gerek duyulan diğer projeler tespit edilir ve atama
yapılır. Çalışanların maaş hesaplamaları sistemin iki farklı muhasebe
programından biriyle gerçekleştirilmektedir. Hangi programın kullanılacağına
işe alım sırasında kişinin alınacağı departmana göre karar verilir.

Şirket kaynakların boşa harcanmaması ve sermaye koruma amacıyla gerekli
gördüğünde işten çıkarmalar gerçekleştirir. Bu işlemde ise sistem hiçbir
projeye uygun görülmeyen çalışanları bildirir. İşten çıkarılan çalışanların
tazminat miktarı YSOFT’ ta çalıştıkları süre üzerinden sistem tarafından kendi
muhasebe programıyla hesaplanır.


## 1.2 Kabul ve kısıtlar

YSOFT Yazılım Evi projelerinde yönetici olması zorunludur ve sadece bir tane
yönetici olabilir. Yanında analist, tasarımcı ve yazılımcı çalışabilir. Projede
çalışabilecek maksimum ve minimum eleman sayısı proje başlangıcında
belirlenir.

Maaş hesaplaması yapılırken şirketin kendi geliştirdiği iki muhasebe
programını kullandığı kabul edilmiştir. Bu şekilde dışarıdan bir muhasebe
yazılımına ihtiyaç duyulmamıştır. Muhasebe 1’de Brüt Maaş = Net Maaş +
SGK Primi + İşsizlik Primi + Gelir Vergisi + Damga Vergisi şeklinde kabul
edilmiştir. Tüm çalışanlar için SGK primi sabit %1 4 , İşsizlik Primi %1, Damga
Vergisi %0.759, Gelir Vergisi ise %12 alınmıştır. Muhasebe 2’de ise geçici
elemanlar için sabit bir ücret atanmıştır. Net maaş çalışanın eline geçen, brüt
maaş ise şirket kasasından düşen miktardır.

Görevler için belirlenen net maaşlar Şekil 1’de gösterilmiştir.

```
Şekil 1 Maaş Tablosu
```
Tazminat olarak işten çıkarılan çalışana çalıştığı her yıl için bir brüt maaş
verildiği kabul edilmiştir. Bir seneden az çalışan çalışanlara ise bir yarım maaş
tazminat verilir. Bu miktarlardan damga vergisi düşülmediği kabul
edilmektedir. Hesaplamaları kolaylaştırmak adına şirket tarafından ikramiye,
yemek kartı vb. imkanların sağlanmadığı kabul edilmiştir.

### GÖREV NET MAAŞ

```
Yönetici 10.
Analist 7.
Yazılımcı 6.
Tasarımcı 5.
```

Proje için ayrılan süre Gantt diyagramında da görülebileceği gibi 8 haftadır.
Detaylı iş-zaman çizelgesi Şekil 2’de paylaşılmıştır.

```
Şekil 2 Gantt Diyagramı
```
## 1.3 Ekip Organizasyon Şeması, Görev Dağılımları

Ekip organizasyon şeması ve görev dağılımları, Şekil 3’de gösterilmiştir.

Şekil 3 Ekip Şeması


## 1.4 Risk Tablosu

RİSK
İD OLASILIK^ ETKİ^ TÜRÜ^ RİSK^ AÇIKLAMA^ NEDENİ^ ÖNLEMLERİ^

1 Düşük Yüksek

```
Proje
```
```
Organizasyon
ve Yönetim
```
```
Proje ekibi
devamlılığının
korunamaması
```
```
Proje ekibinde çalışanların
proje sonlanmadan
ayrılması
```
```
Proje başlangıcında
çalışanlarla sözleşme
yapılır.
```
2 Düşük Yüksek Finansal ve Ekonomik Bütçe Darlığı Bütçenin Yeterli Olmaması Risk bütçesi ayrılır durumlarda kullanılır.gerekli

3 Düşük Orta Finansal ve Ekonomik
Muhasebe Eksikliği

(^)
Mali denetimlerin
yapılmaması sonucu
bütçeden gereksiz
harcamalar yapılması
Muhasebe denetleme
ekibi harcama ve
giderlerin kaydedilmesi
4 Düşük Yüksek Personel Yazılım Geliştirme Deneyimi Ekibin yazılım geliştirmede deneyimsiz olması
İşe alımda deneyimli
elemanlar seçilir. Kurum
içinde gerekli eğitimler
verilir.
(^)
5 Düşük Orta Personel Takım Ruhu olmaması
İşbirliği göstermeme ve
bağımsız hareketler
sergileme
Profesyonel olarak
çalışma deneyimine
sahip, uyumlu çalışanlar
işe alınır.
6 Yüksek Orta Müşteri Müşteri İsteklerinin Değişmesi Müşterinin isteklerinin değişmesi
Haftalık toplantılar
düzenleyip müşteri
dinlenerek güncellemeler
yapılır.
(^)
7 Orta Orta Müşteri Müşterinin Zaman ve Maliyet Baskısı
Müşterinin daha az bütçe
ve kısa zaman talep
etmesi
Proje başında sözleşmede
maliyet ve teslim tarihi
belirlenip imza atılır.
(^)
8 Düşük Orta
Teknik
Güncellik Yeni teknoloji kullanımı
Yeni bir proje
yürütülürken eski
teknolojilerin kullanılması
Teknoloji desteği alınır ve
proje boyunca yeni
teknolojiler takip edilir.
(^)
9 Orta Yüksek Teknik Proje Takibi Proje takibinde aksaklık ile yazılım kalitesinin düşmesi Proje Takip ekibi oluşturulur.


# 2. İsteklerin Modellenmesi

YSOFT Yazılım Evi İnsan Kaynakları Sistemi için insan kaynakları uzmanı
için bir adet ana öykü bulunmaktadır. Bu öykü aşağıdaki şekilde
oluşturulmuştur.

**İnsan Kaynakları Uzmanı:**

**Ana Öykü:**

1. İK Uzmanı Bilgi Sistemine giriş yapar.
2. Proje gereksinimlerini girer ve yeni proje oluşturur.
3. Projede ihtiyaç duyulan göreve ait çalışanlar işe alınır.
4. Yeni alınan çalışanın maaşı yönetici, tasarımcı, analist ya da
    programcıysa muhasebe programı1 ile; test veya bakım elemanı ise
    muhasebe programı2 ile hesaplanır.
5. Projede ihtiyaç duyulan görevlere uygun çalışanlar atanır.
6. Proje sonlandığında İK uzmanı projeyi kapatır.
7. Biten bir projedeki çalışanlar görevlerine göre sistem tarafından eksik
    çalışan olan projelere atanırlar.
8. Projesi değişen çalışanların proje bilgisi sistem tarafından güncellenir.

Alternatif **Öykü:**

1. Eğer çalışanın atanabileceği bir proje bulunamazsa çalışan tazminatı
    ödenerek işten çıkarılır.
2. Tazminat, şirket tarafından geliştirilen tazminat hesaplama programı ile
    hesaplanır.

Müşteri ile kullanım senaryoları konusunda anlaşılmış olup, sözleşme
hazırlanmasına gerek duyulmamıştır.


Kullanım Senaryolarına göre oluşturulmuş Use-Case diyagramı Şekil 4’ de
gösterilmiştir.

```
Şekil 4 Use-Case Diyagramı
```

# 3. Nesneye Dayalı Modelleme

# 3.1 Sınıf Diyagramı (UML)


# 4. Nesneye Dayalı Tasarım

# 4.1 Durum (State ) Diyagramı


# 4.2 Etkinlik (Activity ) Diyagramı


# 4.3 Sıralama ( Sequence) Diyagramı



This is a offline tool, your data stays locally and is not send to any server!
Feedback & Bug Reports
