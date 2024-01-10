# Zincirleme Yöntemi ile Hash Tablosu

Bu basit Java projesi, zincirleme yöntemini kullanarak bir hash tablosunda elemanları saklamaktadır. Kullanıcılar, menü üzerinden sayılar ekleyebilir, eklenen sayıları listeleyebilir ve programdan çıkabilir.


## Kullanım Kılavuzu

Proje, aşağıdaki temel adımları içeren bir kullanım kılavuzu sunmaktadır:

1. **Ekle (1):** Bu seçenek, kullanıcının bir sayı eklemesine olanak tanır. Kullanıcıdan bir sayı alınır ve hash tablosuna eklenir.

2. **Yazdır (2):** Bu seçenek, mevcut hash tablosundaki tüm elemanları listeleyerek kullanıcıya gösterir.

3. **Çıkış (3):** Bu seçenek, programdan çıkış yapmanızı sağlar.

4. **Hatalı Seçim:** Kullanıcı hatalı bir seçim yaparsa, programa tekrar geçerli bir seçim yapması için uyarıda bulunulur.

## Proje Yapısı

Proje, aşağıdaki ana sınıflardan oluşur:

- **Main:** Kullanıcı arayüzünü sağlar ve temel kullanım akışını yönetir.

- **NodeOp:** Hash tablosu üzerinde operasyonları gerçekleştiren sınıftır.

- **Node:** Hash tablosuna eklenen elemanları temsil eden düğüm sınıfıdır.

## Hash Tablosu ve Zincirleme

Proje, bir hash tablosu kullanarak elemanları saklar. Elemanlar eklenirken, her bir elemanın hash değeri alınarak uygun indekse yerleştirilir. Eğer aynı indekste başka elemanlar varsa, zincirleme yöntemiyle bu elemanlar bir liste içinde tutulur.

Örneğin, hash tablosu boyutu 8 ise, her elemanın indeksi `sayi % 8` olarak belirlenir. Zincirleme, aynı indekse sahip elemanların bağlı liste ile bir arada tutulmasını sağlar.

---

Bu proje, basit bir hash tablosu ve zincirleme uygulamasını içerir. Daha fazla ayrıntı ve özel kullanım senaryoları için kodu inceleyebilirsiniz.