import { TestBed } from '@angular/core/testing';

import { ReusableAPI } from './reusable-api';

describe('ReusableAPI', () => {
  let service: ReusableAPI;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ReusableAPI);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
