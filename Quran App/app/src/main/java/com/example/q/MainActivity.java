package com.example.q;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView List=findViewById(R.id.List);
        String[] urduSurahNames = {"الفاتحۃ","البقرۃ","آل عمران","النسآء","المآئدۃ","الانعام","الاعراف","الانفال","التوبۃ","یونس","ھود","یوسف","الرعد","ابراھیم","الحجر","النحل","الاسراء","الکہف","مریم","طٰہٰ","الانبیآء","الحج","المؤمنون","النور","الفرقان","الشعراء", "النمل","القصص","العنکبوت","الروم","لقمٰن","السجدۃ","الاحزاب","سبا",
                "فاطر",
                "یٰسٓ",
                "الصّٰفّٰت",
                "صٓ",
                "الزمر",
                "الغافر",
                "فصلت",
                "الشُّورٰی",
                "الزُّخرُف",
                "الدُّخَان",
                "الجاثیہ",
                "الاحقاف",
                "محمد",
                "الفتح",
                "الحجرات",
                "قٓ",
                "الذّٰریٰت",
                "الطّور",
                "النجم",
                "القمر",
                "الرحمٰن",
                "الواقعۃ",
                " الحدید",
                "المجادلۃ",
                "الحشر",
                " الممتحنۃ",
                "الصّف",
                "الجُمعۃ",
                "المُنٰفِقُون",
                " التّغابن",
                "الطّلاق",
                "التحریم",
                "الملک",
                "القلم",
                " الحاقہ",
                "المعارج",
                "نُوح",
                "الجن",
                "المزّمّل",
                "المدّثّر",
                "القیٰمۃ",
                "الانسان",
                "المرسلٰت",
                "النَّبَاِ",
                "النّٰزِعٰتِ",
                "عَبَسَ",
                " التَّکوِیر",
                " الاِنفِطَار",
                "المُطَفِّفِین",
                "الاِنشِقَاق",
                "البُرُوج",
                "الطَّارق",
                "الاَعلیٰ",
                "الغَاشِیَۃ",
                "الفجر",
                "البلد",
                " الشَّمس",
                "الَّیل",
                "الضُّحٰی",
                "الم نشرح",
                "التّین",
                "العَلَق",
                " القدر",
                "البیّنۃ",
                "الزّلزال",
                "العٰدیٰت",
                " القارعۃ",
                "التّکاثُر",
                " العصر",
                "الھُمَزَۃ",
                "الفِیل",
                "قُرَیش",
                "المَاعُون",
                "الکوثر",
                "الکٰفرون",
                "النَّصَر",
                "اللَّھب",
                "الاخلاص",
                "الفَلَق",
                " النَّاس"
        };

        public List<String> GetSurahNames() {
            List<String> list = null;
            for (int index = 0; index < urduSurahNames.length; ++index)
                list.add(urduSurahNames[index]);
            return List;
        }


        java.util.List<String> array = new ArrayList<String>();
        for (int i = 0; i<urduSurahNames.length; i++)
        {
            array.add(getSurahStart());
        }

    }
}
    }
}
