set names utf8;
set foreign_key_checks=0;

drop database if exists sampleweb2;
create database if not exists sampleweb2;

use sampleweb2;

create table user_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) unique not null comment "ユーザーID",
password varchar(16) not null comment "パスワード",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
sex tinyint not null default 0 comment "性別",
email varchar(32) not null comment "メールアドレス",
status tinyint not null default 0 comment "ステータス",
logined tinyint not null default 0 comment "ログインフラグ",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="会員情報テーブル"
;
insert into user_info values
(1,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(2,"admin","admin","インターノウス","アドミン","いんたーのうす","あどみん",0,"guest@gmail.com",1,0,now(),now());

create table m_category(
id int primary key not null auto_increment comment "ID",
category_id int not null unique comment "カテゴリID",
category_name varchar(20) not null unique comment "カテゴリ名",
category_description varchar(100) comment "カテゴリ詳細",
insert_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カテゴリマスタテーブル"
;
insert into m_category values
(1,1,"全てのカテゴリー","文房具・本、家電・パソコン、おもちゃ・ゲーム全てのカテゴリーが対象となります",now(), null),
(2,2,"文房具・本","文房具や本に関するカテゴリーが対象となります",now(),null),
(3,3,"家電・パソコン","家電・パソコンに関するカテゴリーが対象となります",now(),null),
(4,4,"おもちゃ・ゲーム","おもちゃ・ゲームに関するカテゴリーが対象となります",now(),null);

create table product_info(
id int primary key not null auto_increment comment "ID",
product_id int not null unique comment "商品ID",
product_name varchar(100) not null comment "商品名",
product_name_kana varchar(100) not null comment "商品名かな",
product_description varchar(255) not null comment "商品詳細",
category_id int not null not null comment "カテゴリID",
price int comment "価格",
image_file_path varchar(100) comment "画像ファイルパス",
image_file_name varchar(50) comment "画像ファイル名",
release_date datetime not null comment "発売年月",
release_company varchar(50) comment "発売会社",
status tinyint not null default 0 comment "ステータス",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日",
foreign key(category_id) references m_category(category_id)
)
default charset=utf8
comment="商品情報テーブル"
;

insert into product_info values
( 1, 1,"万年筆","まんねんひつ","綺麗に書けます。",2,200,"./images","image2.jpg",now(),"発売会社",0,now(),now()),
( 2, 2,"消しゴム","けしごむ","よく消せます。",2,100,"./images","image3.jpg",now(),"発売会社",0,now(),now()),
( 3, 3,"はさみ","はさみ","よく切れます！",2,120,"./images","image4.jpg",now(),"発売会社",0,now(),now()),
( 4, 4,"のり","のり","あると便利です。",2,100,"./images","image5.jpg",now(),"発売会社",0,now(),now()),
( 5, 5,"ノートブック","のーとぶっく","色んな事に使えます",2,200,"./images","images.jpg",now(),"発売会社",0,now(),now()),
( 6, 6,"ノートPC1","のーとぱそこん1","スペックは並です。",3,27100,"./images","pc1.jpg",now(),"発売会社",0,now(),now()),
( 7, 7,"ノートPC2","のーとぱそこん2","スペックはそこそこです。",3,39200,"./images","pc2.jpg",now(),"発売会社",0,now(),now()),
( 8, 8,"ノートPC3","のーとぱそこん3","スペック・メモリ共に高いです。",3,55300,"./images","pc3.jpg",now(),"発売会社",0,now(),now()),
( 9, 9,"冷蔵庫","れいぞうこ","キンキンに冷えます。",3,37100,"./images","reizou.jpg",now(),"発売会社",0,now(),now()),
( 10,10,"電子レンジ","でんしれんじ","500W,700W,1000Wも扱えます！",3,23200,"./images","renji.jpg",now(),"発売会社",0,now(),now()),
( 11,11,"テレビ","てれび","大画面でテレビをご覧になりたい方におすすめ！",3,40400,"./images","terebi.jpg",now(),"発売会社",0,now(),now()),
( 12,12,"プレステーション3","ぷれすてーしょん","今なら特価セール中",4,19800,"./images","PS3.jpg",now(),"発売会社",0,now(),now()),
( 13,13,"プレステーション4","ぷれすてーしょん","今作話題のモンスターハンターワールド等も！",4,29800,"./images","PS4.jpg",now(),"発売会社",0,now(),now()),
( 14,14,"任天堂WiiU","にんてんどううぃーゆー","スプラトゥーン等の人気ゲームが遊べます！",4,29800,"./images","wiiU.jpg",now(),"発売会社",0,now(),now());

create table cart_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
temp_user_id varchar(16) comment "仮ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カート情報テーブル"
;



create table purchase_history_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
destination_id int not null comment "宛先情報ID",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日",
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
)
default charset=utf8
comment="購入履歴情報テーブル"
;

create table destination_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
email varchar(32) not null comment "メールアドレス",
tel_number varchar(13) not null comment "電話番号",
user_address varchar(50) not null comment "住所",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="宛先情報テーブル"
;
insert into destination_info values
(1,"guest","インターノウス","テストユーざー","いんたーのうす","てすとゆーざー","guest@internous.co.jp","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),now()),

create table inquiry(
userId varchar(255),
qtype varchar(255),
body varchar(255)
);

