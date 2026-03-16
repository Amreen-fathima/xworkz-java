class MapExecutor {

public static void main(String[] args) {

Map m1 = new Map(
"World Map","Political","1:50000000","World","English",
"National Geographic","Paper","Colorful","Mercator",
"2023 Edition","Large","Foldable","High",
"No","Education","High Quality","Standard",
"Latitude Longitude","Online","Medium"
);

Map m2 = new Map(
"India Map","Political","1:10000000","India","English",
"Survey of India","Paper","Multi Color","Mercator",
"2022 Edition","Medium","Foldable","High",
"No","Education","High Quality","Detailed",
"Latitude Longitude","Stationery Store","Low"
);

Map m3 = new Map(
"Karnataka Map","Administrative","1:2000000","Karnataka","English",
"State Publisher","Paper","Multi Color","Mercator",
"2021 Edition","Medium","Foldable","Medium",
"No","Education","Standard","Simple",
"Grid Lines","Book Store","Low"
);

Map m4 = new Map(
"Asia Map","Physical","1:25000000","Asia","English",
"Atlas Publications","Paper","Natural Colors","Robinson",
"2023 Edition","Large","Foldable","High",
"No","Research","Premium","Detailed",
"Latitude Longitude","Online","Medium"
);

Map m5 = new Map(
"City Map","Road Map","1:50000","Bangalore","English",
"City Maps Ltd","Plastic","Bright Colors","Mercator",
"2024 Edition","Small","Pocket Fold","High",
"Yes","Navigation","High","Detailed",
"Street Grid","Online","Medium"
);

Map m6 = new Map(
"Tourist Map","Guide Map","1:75000","Goa","English",
"Tourism Board","Paper","Bright Colors","Mercator",
"2023 Edition","Medium","Foldable","Medium",
"No","Tourism","Good","Tourist Legend",
"Grid Lines","Tourist Center","Low"
);

Map m7 = new Map(
"Railway Map","Transport Map","1:3000000","India","English",
"Railway Authority","Paper","Multi Color","Mercator",
"2022 Edition","Large","Foldable","High",
"No","Travel","Standard","Rail Legend",
"Network Grid","Online","Medium"
);

Map m8 = new Map(
"Historical Map","History Map","1:15000000","Ancient World","English",
"History Press","Paper","Vintage Colors","Robinson",
"2020 Edition","Large","Flat","Medium",
"No","Research","Premium","Historical",
"Reference Grid","Library","High"
);

Map m9 = new Map(
"Climate Map","Thematic Map","1:20000000","Global","English",
"Climate Institute","Paper","Gradient Colors","Robinson",
"2023 Edition","Large","Foldable","Medium",
"No","Research","High","Climate Legend",
"Latitude Grid","Online","Medium"
);

Map m10 = new Map(
"School Atlas Map","Educational Map","1:10000000","World","English",
"Oxford Atlas","Paper","Colorful","Mercator",
"2024 Edition","Medium","Foldable","High",
"No","School Education","High","Student Legend",
"Latitude Longitude","Book Store","Affordable"
);

m1.display();
m2.display();
m3.display();
m4.display();
m5.display();
m6.display();
m7.display();
m8.display();
m9.display();
m10.display();

}
}