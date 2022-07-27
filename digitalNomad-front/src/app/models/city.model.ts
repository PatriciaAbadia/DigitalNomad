export class City {

    constructor(
        private _city: string,
        private _country: string,
        private _continent: string,
        private _totalScore: number,
        private _costOfLife: number,
        private _remoteWorkers: number,
        private _internet: string,
        private _fun: string,
        private _nightlife: string,
        private _safety: string,
        private _lackOfCrime: string,
        private _walkability: string,
        private _racism: string,
        private _foreignersFriendly: string,
        private _freedomOfSpeech: string,
        private _femaleFriendly: string,
        private _lgbtqFriendly: string,
        private _englishSpeaking: string,
        private _latitude: number,
        private _longitude: number,
        private _nearBeach: string,
        private _photo: string,
        // private _citySeason: string,
        // private _feelTemperature: number,
        // private _realTemperature: number,
        // private _humidity: number,
        // private _rain: number,
        // private _comment: string,
        
    ) { }
    // public get comment(): string {
    //     return this._comment;
    // }
    // public set comment(value: string) {
    //     this._comment = value;
    // }
    // public get rain(): number {
    //     return this._rain;
    // }
    // public set rain(value: number) {
    //     this._rain = value;
    // }
    public get nearBeach(): string {
        return this._nearBeach;
    }
    public set nearBeach(value: string) {
        this._nearBeach = value;
    }
    // public get humidity(): number {
    //     return this._humidity;
    // }
    // public set humidity(value: number) {
    //     this._humidity = value;
    // }
    // public get realTemperature(): number {
    //     return this._realTemperature;
    // }
    // public set realTemperature(value: number) {
    //     this._realTemperature = value;
    //}
    public get foreignersFriendly(): string {
        return this._foreignersFriendly;
    }
    public set foreignersFriendly(value: string) {
        this._foreignersFriendly = value;
    }
    // public get feelTemperature(): number {
    //     return this._feelTemperature;
    // }
    // public set feelTemperature(value: number) {
    //     this._feelTemperature = value;
    // }
    // public get citySeason(): string {
    //     return this._citySeason;
    // }
    // public set citySeason(value: string) {
    //     this._citySeason = value;
    // }
    public get photo(): string {
        return this._photo;
    }
    public set photo(value: string) {
        this._photo = value;
    }
    public get longitude(): number {
        return this._longitude;
    }
    public set longitude(value: number) {
        this._longitude = value;
    }
    public get latitude(): number {
        return this._latitude;
    }
    public set latitude(value: number) {
        this._latitude = value;
    }
    public get lgbtqFriendly(): string {
        return this._lgbtqFriendly;
    }
    public set lgbtqFriendly(value: string) {
        this._lgbtqFriendly = value;
    }
    public get englishSpeaking(): string {
        return this._englishSpeaking;
    }
    public set englishSpeaking(value: string) {
        this._englishSpeaking = value;
    }
    public get femaleFriendly(): string {
        return this._femaleFriendly;
    }
    public set femaleFriendly(value: string) {
        this._femaleFriendly = value;
    }
    public get freedomOfSpeech(): string {
        return this._freedomOfSpeech;
    }
    public set freedomOfSpeech(value: string) {
        this._freedomOfSpeech = value;
    }
    public get racism(): string {
        return this._racism;
    }
    public set racism(value: string) {
        this._racism = value;
    }
    public get walkability(): string {
        return this._walkability;
    }
    public set walkability(value: string) {
        this._walkability = value;
    }
    public get lackOfCrime(): string {
        return this._lackOfCrime;
    }
    public set lackOfCrime(value: string) {
        this._lackOfCrime = value;
    }
    public get safety(): string {
        return this._safety;
    }
    public set safety(value: string) {
        this._safety = value;
    }
    public get nightlife(): string {
        return this._nightlife;
    }
    public set nightlife(value: string) {
        this._nightlife = value;
    }
    public get fun(): string {
        return this._fun;
    }
    public set fun(value: string) {
        this._fun = value;
    }
    public get internet(): string {
        return this._internet;
    }
    public set internet(value: string) {
        this._internet = value;
    }
    public get remoteWorkers(): number {
        return this._remoteWorkers;
    }
    public set remoteWorkers(value: number) {
        this._remoteWorkers = value;
    }
    public get costOfLife(): number {
        return this._costOfLife;
    }
    public set costOfLife(value: number) {
        this._costOfLife = value;
    }
    public get totalScore(): number {
        return this._totalScore;
    }
    public set totalScore(value: number) {
        this._totalScore = value;
    }
    public get continent(): string {
        return this._continent;
    }
    public set continent(value: string) {
        this._continent = value;
    }
    public get country(): string {
        return this._country;
    }
    public set country(value: string) {
        this._country = value;
    }
    public get city(): string {
        return this._city;
    }
    public set city(value: string) {
        this._city = value;
    }
    
    //to json
    // export toJson() any {
    //     return {
    //         city: this._city,
    //         country: this._country,
    //         continent: this._continent,
    //         totalScore: this._totalScore,
    //         costOfLife: this._costOfLife,
    //         remoteWorkers: this._remoteWorkers,
    //         internet: this._internet,
    //         fun: this._fun,
    //         nightlife: this._nightlife,
    //         safety: this._safety,
    //         lackOfCrime: this._lackOfCrime,
    //         walkability: this._walkability,
    //         racism: this._racism,
    //         foreignersFriendly: this._foreignersFriendly,
    //         freedomOfSpeech: this._freedomOfSpeech,
    //         femaleFriendly: this._femaleFriendly,
    //         lgbtqFriendly: this._lgbtqFriendly,
    //         englishSpeaking: this._englishSpeaking,
    //         latitude: this._latitude,
    //         longitude: this._longitude,
    //         nearBeach: this._nearBeach,
    //         photo: this._photo,
    //         citySeason: this._citySeason,
    //         feelTemperature: this._feelTemperature,
    //         realTemperature: this._realTemperature,
    //         humidity: this._humidity,
    //         rain: this._rain,
    //         comment: this._comment
    //     };
    // }   
}


    

