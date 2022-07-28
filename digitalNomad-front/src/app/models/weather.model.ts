export class Weather {

    constructor(
        

        private _citySeason: string,
        private _city: string,
        private _season: string,
        private _feelWeather: string,
        private _feelTemperature: number,
        private _realWeather: string,
        private _realTemperature: number,
        private _feelDamp: string,
        private _humidity: number,
        private _isRainy: string,
        private _rain: number,

        
    ) { }
    public set isRainy(value: string) {
        this._isRainy = value;
        }
    public get isRainy(): string {
        return this._isRainy;
    }
    public set feelDamp(value: string) {
        this._feelDamp = value;
        }
    public get feelDamp(): string {
        return this._feelDamp;
    }
    public set realWeather(value: string) {
        this._realWeather = value;
        }
    public get realWeather(): string {
        return this._realWeather;
    }
    public set feelWeather(value: string) {
        this._feelWeather = value;
        }
    public get feelWeather(): string {
        return this._feelWeather;
    }
    public set season(value: string) {
        this._season = value;
        }
    public get season(): string {
        return this._season;
    }
    public set citySeason(value: string) {
    this._citySeason = value;
    }
    public get citySeason(): string {
        return this._citySeason;
    }
    public get city(): string {
        return this._city;
    }
    public set city(value: string) {
        this._city = value;
    }
    public get rain(): number {
        return this._rain;
    }
    public set rain(value: number) {
        this._rain = value;
    }
    public get humidity(): number {
        return this._humidity;
    }
    public set humidity(value: number) {
        this._humidity = value;
    }
    public get realTemperature(): number {
        return this._realTemperature;
    }
    public set realTemperature(value: number) {
        this._realTemperature = value;
    }

    public get feelTemperature(): number {
        return this._feelTemperature;
    }
    public set feelTemperature(value: number) {
        this._feelTemperature = value;
    }

}


    

