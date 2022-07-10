import { TestBed } from '@angular/core/testing';

import { LendtechService } from './lendtech.service';

describe('LendtechService', () => {
  let service: LendtechService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LendtechService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
