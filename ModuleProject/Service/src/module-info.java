module Service {
    exports translator;         // экспортирует пакет translator
    uses translator.Translate;  // объявляет себя как службу, требует реализовать интерфейс Translate.
}