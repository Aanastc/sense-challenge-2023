import { Injectable, NotFoundException, ConflictException } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { get } from 'http';
import { CityEntity } from 'src/models/domain/city.entity';
import { CountryEntity } from 'src/models/domain/country.entity';
import { GetCitiesByCountryDto } from 'src/models/dto/get.cities.by.country.dto';
import { CitySchema } from 'src/schemas/city.schema';
import { Repository } from 'typeorm';
import { Like } from "typeorm"

@Injectable()
export class CityService {
  constructor(
    @InjectRepository(CityEntity) private cityRepository: Repository<CityEntity>,
    @InjectRepository(CountryEntity) private countryRepository: Repository<CountryEntity>) {}

  async getCitiesByCountry(countryId: string, getCitiesByCountryDto: GetCitiesByCountryDto): Promise<CityEntity[] | null> {
    //implementar aqui :)

    var allCities = this.cityRepository.find({
      relations: ["country"]
    });

    return allCities
  }

  public async create(countryId: string, body: CitySchema): Promise<CityEntity> | null {
    //implementar aqui :)

    return null;
  }

  public async updateCitiesByCountry(countryId: string, cityId: string, body: CitySchema): Promise<CityEntity> | null {
    //implementar aqui :)

    return null
  }
}
