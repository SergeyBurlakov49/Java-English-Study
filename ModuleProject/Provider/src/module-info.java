import englishTranslator.EnglishTranslate;

module Provider {
    requires Service;                                       // импортирует модуль Service
    provides translator.Translate with EnglishTranslate;    // реализует его как провайдер через класс EnglishTranslate
    exports englishTranslator;                              // экспортирует получившуюся логику
}